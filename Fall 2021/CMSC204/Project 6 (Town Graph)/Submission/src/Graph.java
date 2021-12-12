import java.util.*;

/**
 * @author Brandon Tenorio
 */

public class Graph implements GraphInterface<Town, Road> {
    private ArrayList<String> shortestPath = new ArrayList<>();
    private Set<Town> towns = new HashSet<>();
    private Set<Road> roads = new HashSet<>();
    private Town destination;


    public Road getEdge(Town sourceVertex, Town destinationVertex) {
        if(sourceVertex == null || destinationVertex == null) return null;

        Road road = null;
        for(Road r : roads) if(r.contains(sourceVertex) && r.contains(destinationVertex)) road = r;
        return road;
    }


    public Road addEdge(Town sourceVertex, Town destinationVertex, int distance, String description) throws IllegalArgumentException, NullPointerException {
        if(sourceVertex == null || destinationVertex == null) throw new NullPointerException();
        if(!containsVertex(sourceVertex) || !containsVertex(destinationVertex)) throw new IllegalArgumentException();

        Road road = new Road(sourceVertex, destinationVertex, distance, description);
        roads.add(road);
        return road;
    }



    public boolean addVertex(Town t) throws NullPointerException {
        if(t == null) throw new NullPointerException();

        if(!towns.contains(t)) {
            towns.add(t);
            return true;
        }
        else return false;
    }


    public boolean containsEdge(Town sourceVertex, Town destinationVertex) {
        for(Road r : roads) if(r.contains(sourceVertex) && r.contains(destinationVertex)) return true;
        return false;
    }


    public boolean containsVertex(Town t) {
        return towns.contains(t);
    }


    public Set<Road> edgeSet() {
        return roads;
    }


    public Set<Road> edgesOf(Town town) throws NullPointerException, IllegalArgumentException {
        if(town == null) throw new NullPointerException();

        Set<Road> roadSet = new HashSet<>();

        for(Road r : roads) if(r.contains(town)) roadSet.add(r);
        if(roadSet.isEmpty()) throw new IllegalArgumentException();

        return roadSet;
    }


    public Road removeEdge(Town sourceVertex, Town destinationVertex, int distance, String description) {
        Road road = null;

        for(Road r : roads) if(r.contains(destinationVertex) && r.contains(sourceVertex) && (distance > -1) && description != null) road = r;
        if(roads.remove(road)) return road;

        return null;
    }



    public boolean removeVertex(Town t) {
        if(t == null) return false;
        return towns.remove(t);
    }


    public Set<Town> vertexSet() {
        return towns;
    }

    public ArrayList<String> shortestPath(Town sourceVertex, Town destinationVertex) {
        destination = destinationVertex;
        dijkstraShortestPath(sourceVertex);
        ArrayList<Road> roadPath = new ArrayList<>();
        ArrayList<String> roadPathString = new ArrayList<>();


        if(roads.stream().noneMatch(r -> r.contains(sourceVertex)) || roads.stream().noneMatch(r -> r.contains(destinationVertex))) return new ArrayList<>();

        for(int i = 0; i < shortestPath.size() - 1; i++) {
            Town source = new Town(shortestPath.get(i));
            Town destination = new Town(shortestPath.get(i + 1));
            Road road = getEdge(source, destination);
            roadPath.add(new Road(source, destination, road.getDistance(), road.getName()));
        }

        shortestPath.clear();

        for(int i = 0 ; i < roadPath.size(); i++) roadPathString.add(i, roadPath.get(i).toString());

        return roadPathString;
    }


    public void dijkstraShortestPath(Town sourceVertex) {
        shortestPath.clear();
        List<Town> townsList = new ArrayList<>(towns);
        int[][] adjacencyMatrix;
        int[] minDistances;
        boolean[] visited;
        int[] minPath;

        int beginningTown = 0;
        int finalTown = 0;
        int totalTowns;

        adjacencyMatrix = new int[towns.size()][towns.size()];

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if (i == j || !containsEdge(townsList.get(i), townsList.get(j))) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    int distance = getEdge(townsList.get(i), townsList.get(j)).getDistance();
                    adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = distance;
                }
            }
        }

        //int startTown = 0;
        for(Town t : townsList) {
            if (!t.equals(sourceVertex)) beginningTown++;
            else break;
        }

        //int endTown = 0;

        for(Town t : townsList) {
            if (!t.equals(destination)) finalTown++;
            else break;
        }

        totalTowns = adjacencyMatrix[0].length;
        minDistances = new int[totalTowns];
        visited = new boolean[totalTowns];

        for(int t = 0; t < totalTowns; t++) {
            minDistances[t] = Integer.MAX_VALUE;
            visited[t] = false;
        }

        minDistances[beginningTown] = 0;
        minPath = new int[totalTowns];
        minPath[beginningTown] = -1;

        for (int i = 1; i < totalTowns; i++) {
            int nearestTown = -1;
            int minDistance = Integer.MAX_VALUE;

            for(int townPos = 0; townPos < totalTowns; townPos++) {
                if (!visited[townPos] && minDistances[townPos] < minDistance) {
                    nearestTown = townPos;
                    minDistance = minDistances[townPos];
                }
            }

            visited[nearestTown] = true;

            for(int townPos = 0; townPos < totalTowns; townPos++) {
                int roadDistance = adjacencyMatrix[nearestTown][townPos];
                if (roadDistance > 0 && ((minDistance + roadDistance) < minDistances[townPos])) {
                    minPath[townPos] = nearestTown;
                    minDistances[townPos] = minDistance + roadDistance;
                }
            }

        }
        getShortPath(finalTown, minPath);
    }

    private void getShortPath(int sourceVertex, int[] minPathLengths) {
        if(sourceVertex == -1) return;
        getShortPath(minPathLengths[sourceVertex], minPathLengths);

        int townIndex = 0;

        for(Town t : towns) {
            if(townIndex == sourceVertex) shortestPath.add(t.getName());
            townIndex++;
        }
    }
}
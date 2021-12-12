import java.util.*;
/**
 * @author Brandon Tenorio
 */
public class Graph implements GraphInterface<Town, Road>{
    final int noEdge = Integer.MAX_VALUE;
    final int noPath = Integer.MAX_VALUE;

    private Set<Town> towns = new HashSet<>();
    private Set<Road> roads = new HashSet<>();
    private final ArrayList<String> shortestPath = new ArrayList<>();
    private Town destination;

    public Road getEdge(Town sourceVertex, Town destinationVertex) {
        Road road = null;
        for (Road r : roads) if (r.contains(sourceVertex) && r.contains(destinationVertex)) road = r;

        return road;
    }

    public Road addEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
        if(sourceVertex == null || destinationVertex == null) throw new NullPointerException();

        Road road = new Road(sourceVertex, destinationVertex, weight, description);
        roads.add(road);
        return road;
    }

    public boolean addVertex(Town town){
        if(town == null) throw new NullPointerException();
        if(!towns.contains(town)) {
            towns.add(town);
            return true;
        }
        else return false;
    }

    public boolean containsEdge(Town sourceVertex, Town destinationVertex){
        for(Road temp : roads) if(temp.contains(sourceVertex) && temp.contains(destinationVertex)) return true;
        return false;
    }

    public boolean containsVertex(Town town){
        for(Town temp : towns) if(temp.getName().equals(town.getName())) return true;
        return false;
    }

    public Set<Road> edgeSet() {
        return roads;
    }

    public Set<Road> edgesOf(Town vertex) {
        Set<Road> temp = new HashSet<>();
        for(Road r : roads) if(r.contains(vertex)) temp.add(r);
        return temp;
    }

    public Road removeEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
        Road road = null;
        for(Road road1 : roads) if(road1.contains(destinationVertex)&& road1.contains(sourceVertex) &&(weight >-1) && description !=null) road = road1;
        if (roads.remove(road)) return road;
        else return null;
    }

    public boolean removeVertex(Town town) {
        return towns.remove(town);
    }

    public Set<Town> vertexSet() {
        return towns;
    }

    public ArrayList<String> shortestPath(Town sourceVertex, Town destinationVertex) {
        destination = destinationVertex;
        dijkstraShortestPath(sourceVertex);
        StringBuilder sPath = new StringBuilder();
        int totalMi = 0;

        for (int i = 0; i < shortestPath.size() - 1; i++) {
            Town source = new Town(shortestPath.get(i));
            Town dest = new Town(shortestPath.get(i + 1));
            Road road = getEdge(source, dest);
            totalMi += road.getWeight();
            sPath.append(source).append(" via ").append(road.getName()).append(" to ").append(dest).append(" ").append(road.getWeight()).append(" mi;");
        }
        shortestPath.clear();
        Collections.addAll(shortestPath, sPath.toString().split(";"));
        shortestPath.add("Total mi: " + totalMi + " mi");

        return shortestPath;
    }

    public void dijkstraShortestPath(Town sourceVertex) {
        shortestPath.clear();
        Town[] townsArray = new Town[towns.size()];
        int[][] adjacencyMatrix;
        int[] minWeights;
        boolean[] visitedTowns;
        int[]minPath;

        int beginningTown = 0;
        int finalTown = 0;
        int totalTowns;
        int index = 0;


        for(Town town : towns){
            townsArray[index] = new Town(town);
            index++;
        }

        adjacencyMatrix = new int[towns.size()][towns.size()];

        for(int i = 0; i < adjacencyMatrix.length; i++){
            for(int j = 0; j < adjacencyMatrix[i].length; j++) {
                if(i == j || !containsEdge(townsArray[i], townsArray[j])) adjacencyMatrix[i][j] = 0;
                else {
                    int weight = getEdge(townsArray[i], townsArray[j]).getWeight();
                    adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = weight;
                }
            }
        }

        for(Town town : townsArray){
            if (!town.equals(sourceVertex)) beginningTown++;
            else break;
        }


        for(Town town : townsArray){
            if (!town.equals(destination)) finalTown++;
            else break;
        }

        totalTowns = adjacencyMatrix[0].length;
        minWeights = new int[totalTowns];

        visitedTowns = new boolean[totalTowns];

        for(int townPos = 0; townPos < totalTowns; townPos++) {
            minWeights[townPos] = noEdge;
            visitedTowns[townPos] = false;
        }
        minWeights[beginningTown] = 0;
        minPath = new int[totalTowns];
        minPath[beginningTown] = -1;


        for(int i = 1; i < totalTowns; i++){
            int nearestTown = -1;
            int smallestWeight = noEdge;
            for (int townIndex = 0; townIndex < totalTowns; townIndex++){
                if(!visitedTowns[townIndex] && minWeights[townIndex] < smallestWeight){
                    nearestTown = townIndex;
                    smallestWeight = minWeights[townIndex];
                }
            }

            visitedTowns[nearestTown] = true;

            for(int townPos = 0; townPos < totalTowns; townPos++){
                int roadDist = adjacencyMatrix[nearestTown][townPos];
                if(roadDist > 0 && ((smallestWeight + roadDist) < minWeights[townPos])){
                    minPath[townPos] = nearestTown;
                    minWeights[townPos] = smallestWeight + roadDist;
                }
            }
        }
        addPathToList(finalTown, minPath);
    } // end of method

    private void addPathToList(int vertex, int[] minPath) {
        if(vertex == -1) return;
        addPathToList(minPath[vertex], minPath);
        int townIndex = 0;

        for(Town town : towns) {
            if (townIndex == vertex) shortestPath.add(town.getName());
            townIndex++;
        }
    }
}

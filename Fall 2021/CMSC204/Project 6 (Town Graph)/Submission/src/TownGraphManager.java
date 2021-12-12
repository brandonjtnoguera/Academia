import java.io.*;
import java.util.*;

/**
 * @author Brandon Tenorio
 */

public class TownGraphManager implements TownGraphManagerInterface{
    private final Graph graph = new Graph();

    public boolean addRoad(String town1, String town2, int weight, String roadName) {
        return graph.addEdge(new Town(town1), new Town(town2), weight, roadName) != null;
    }

    public String getRoad(String town1, String town2) {
        return graph.getEdge(new Town(town2), new Town(town1)).getName();
    }

    public boolean addTown(String town) {
        return graph.addVertex(new Town(town));
    }

    public Town getTown(String townName) {
        for(Town town: graph.vertexSet()) if(town.equals(new Town(townName))) return town;
        return null;
    }

    public boolean containsTown(String townName) {
        return graph.containsVertex(new Town(townName));
    }

    public boolean containsRoadConnection(String town1, String town2) {
        return graph.containsEdge(new Town(town1), new Town(town2));
    }

    public ArrayList<String> allRoads() {
        ArrayList<String> temp = new ArrayList<>();
        for(Road road : graph.edgeSet()) temp.add(road.getName());
        Collections.sort(temp);
        return temp;
    }

    public boolean deleteRoadConnection(String town1, String town2, String road) {
        int degrees = 0;
        String roadName="";
        boolean deletedRoad = false;

        for(Road r : graph.edgeSet()) {
            if(r.contains(new Town(town1)) && r.contains(new Town(town2))) degrees = r.getDistance();
            roadName = r.getName();
        }
        if(graph.removeEdge(new Town(town1), new Town(town2), degrees, roadName) != null) deletedRoad = true;
        return deletedRoad;
    }

    public boolean deleteTown(String townName) {
        return graph.removeVertex(new Town(townName));
    }

    public ArrayList<String> allTowns() {
        ArrayList<String> temp = new ArrayList<>();
        for(Town town : graph.vertexSet()) temp.add(town.getName());
        Collections.sort(temp);
        return temp;
    }

    public ArrayList<String> getPath(String town1, String town2) {
        return graph.shortestPath(new Town(town1), new Town(town2));
    }

    public void populateTownGraph(File file) throws FileNotFoundException, IOException {
        Scanner inputFile = new Scanner(file);
        StringBuilder text = new StringBuilder();
        while(inputFile.hasNextLine()) text.append(inputFile.nextLine()).append(" ");

        inputFile.close();

        String[] roads = text.toString().split(" ");
        String[][] description = new String[roads.length][];

        for(int i = 0; i < description.length; i++) {
            description[i] = new String[4];

            description[i][0] = roads[i].split(";")[0].split(",")[0];
            description[i][1] = roads[i].split(";")[0].split(",")[1];
            description[i][2] = roads[i].split(";")[1];
            description[i][3] = roads[i].split(";")[2];

            addTown(description[i][2]);
            addTown(description[i][3]);
            addRoad(description[i][2], description[i][3], Integer.parseInt(description[i][1]), description[i][0]);
        }
    }
}

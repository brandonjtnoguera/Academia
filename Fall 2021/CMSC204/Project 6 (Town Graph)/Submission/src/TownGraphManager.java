import java.io.*;
import java.util.*;

/**
 * @author Brandon Tenorio
 */

public class TownGraphManager implements TownGraphManagerInterface{
    private final Graph graph = new Graph();

    public boolean addRoad(String town1, String town2, int weight, String roadName) {
        Town t1, t2;
        boolean added = false;
        t1 = new Town(town1);
        t2 = new Town(town2);
        if(graph.addEdge(t1, t2, weight, roadName) != null) added = true;
        return added;
    }

    public String getRoad(String town1, String town2) {
        Town t1, t2;
        t1 = new Town(town1);
        t2 = new Town(town2);
        return graph.getEdge(t1, t2).getName();
    }

    public boolean addTown(String town) {
        Town t1;
        t1 = new Town(town);
        return graph.addVertex(t1);
    }

    public Town getTown(String townName) {
        Town t1;
        t1 = new Town(townName);
        for(Town t: graph.vertexSet()) if(t.equals(t1)) return t;
        return null;
    }

    public boolean containsTown(String townName) {
        Town t1;
        t1 = new Town(townName);
        return graph.containsVertex(t1);
    }

    public boolean containsRoadConnection(String town1, String town2) {
        Town t1,t2;
        t1 = new Town(town1);
        t2 = new Town(town2);
        return graph.containsEdge(t1, t2);
    }

    public ArrayList<String> allRoads() {
        ArrayList<String> temp = new ArrayList<>();
        for(Road road : graph.edgeSet()) temp.add(road.getName());
        Collections.sort(temp);
        return temp;
    }

    public boolean deleteRoadConnection(String town1, String town2, String road) {
        Town t1,t2;
        t1 = new Town(town1);
        t2 = new Town(town2);
        int degrees = 0;
        String roadName="";
        boolean deletedRoad = false;

        for(Road r : graph.edgeSet()) {
            if(r.contains(t1) && r.contains(t2)) degrees = r.getWeight();
            roadName = r.getName();
        }
        if(graph.removeEdge(t1, t2, degrees, roadName) != null) deletedRoad = true;
        return deletedRoad;
    }

    public boolean deleteTown(String townName) {
        Town t1;
        t1 = new Town(townName);
        return graph.removeVertex(t1);
    }

    public ArrayList<String> allTowns() {
        ArrayList<String> temp = new ArrayList<>();
        for(Town town : graph.vertexSet()) temp.add(town.getName());
        Collections.sort(temp);
        return temp;
    }

    public ArrayList<String> getPath(String town1, String town2) {
        Town t1,t2;
        t1 = new Town(town1);
        t2 = new Town(town2);
        return graph.shortestPath(t1, t2);
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

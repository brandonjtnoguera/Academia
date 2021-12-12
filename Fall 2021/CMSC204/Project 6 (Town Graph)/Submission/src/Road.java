/**
 * @author Brandon Tenorio
 */
public class Road implements Comparable<Road> {
    private Town source, destination;
    private int distance;
    private String roadName;
    

    public Road(Town source, Town destination, int weight, String roadName) {
        this.source = source;
        this.destination = destination;
        this.distance = weight;
        this.roadName = roadName;
    }

    
    public Road(Town source, Town destination, String roadName) {
        this.source = source;
        this.destination = destination;
        this.distance = 1;
        this.roadName = roadName;
    }
    
    @Override
    public int compareTo(Road r) {
        return this.roadName.compareTo(r.roadName);
    }

    public boolean contains(Town town) {
        return source.getName().equals(town.getName()) || destination.getName().equals(town.getName());
    }


    public boolean equals(Object road) {
        boolean sameSource = source.equals(((Road) road).source) || source.equals(((Road) road).destination);
        boolean sameDestination = destination.equals(((Road) road).source) || destination.equals(((Road) road).destination);

        return road == this || (sameSource && sameDestination);
    }

    @Override
    public String toString() {
        return source.getName() + " via " + roadName + " to " + destination.getName() + " " + distance
                + " mi";
    }

    public Town getSource() {
        return source;
    }

    public Town getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    String getName() {
        return roadName;
    }
}
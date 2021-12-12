import java.util.*;
/**
 * @author Brandon Tenorio
 */
public class Road implements Comparable<Road>{
    //todo
    protected Town source;
    protected Town destination;
    protected int weight;
    protected String roadName;

    public Road(Town source, Town destination, int weight, String roadName) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.roadName = roadName;
    }

    public Road(Town source, Town destination, String roadName) {
        this.source = source;
        this.destination = destination;
        this.roadName = roadName;
        weight = 1;
    }

    public boolean contains(Town town) {
        return this.source.equals(town) || this.destination.equals(town);
    }

    @Override
    public String toString() {
        return this.roadName;
    }

    public String getName() {
        return roadName;
    }

    public Town getDestination() {
        return destination;
    }

    public Town getSource() {
        return source;
    }

    public int compareTo(Road road) {
        if(this.roadName.equalsIgnoreCase(road.roadName)) return 0;
        else return -1;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object road) {
        boolean sameSource = this.source.equals(((Road) road).source) || this.source.equals(((Road) road).destination);
        boolean sameDestination = this.destination.equals(((Road) road).source) || this.destination.equals(((Road) road).destination);

        return road == this || (sameSource && sameDestination);
    }

    public void setSource(Town source) {
        this.source = source;
    }

    public void setDestination(Town destination) {
        this.destination = destination;
    }

    public void setName(String roadName) {
        this.roadName = roadName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

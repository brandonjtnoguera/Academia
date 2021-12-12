import java.util.*;

/**
 * @author Brandon Tenorio
 */
public class Town implements Comparable<Town>{
    protected String name = "";
    protected Set<Town> towns = new java.util.HashSet<>();
    protected int weight = Integer.MAX_VALUE;
    protected Town previous = null;

    public Town(String townName) {
        this.name = townName;
    }

    public Town(Town templateTown) {
        this.name = templateTown.name;
        this.weight = templateTown.weight;
        this.towns = templateTown.towns;
        this.previous = templateTown.previous;
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Town town) {
        return this.name.compareTo(town.name);
    }

    public String toString() {
        return this.getName();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean equals(Object town) {
        return town == this || this.name.equalsIgnoreCase(((Town) town).name);
    }

}
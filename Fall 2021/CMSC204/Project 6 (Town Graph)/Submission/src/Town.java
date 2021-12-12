/**
 * @author Brandon TYenorio
 */
public class Town implements Comparable<Town>{
    private final String name;

    public Town(String name){
        this.name = name;
    }

    public Town(Town templateTown){
        this.name=templateTown.name;
    }

    @Override
    public int compareTo(Town t) {
        return this.name.compareTo(t.name);
    }

    @Override
    public boolean equals(Object town) {
        return town == this || this.name.equalsIgnoreCase(((Town) town).name);
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

/**
 * Implementation of a dictionary
 * @param <K> key
 * @param <V> value
 * @author Brandon Tenorio
 */
public class DrugSideEffects<K, V> {
    private Hashtable<K,V> sideEffects;
    K key;
    V value;

    public DrugSideEffects(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Boolean addEffect(K effect, V details) {
        if(effect == null || details == null) return false;
        sideEffects.put(effect, details);
        return true;
    }

    public void removeEffect(K effect) throws RuntimeException {
        if(effect == null) throw new RuntimeException("No such effect was found");
        sideEffects.remove(effect);
    }

    public int count() { return sideEffects.size(); }

    public void clear() { sideEffects.clear(); }

    public K key() {
        return key;
    }

    public V value() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    // Methods needed to correctly behave in containers like sets, hashmaps:
    // (I generated those automatically in NetBeans)
}

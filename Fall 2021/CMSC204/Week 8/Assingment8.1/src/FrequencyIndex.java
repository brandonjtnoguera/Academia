import java.io.*;
import java.util.*;
import java.util.Map.*;
import java.util.stream.*;

/**
 * @author Brandon Tenorio
 */
public class FrequencyIndex{
    public String frequencyOf(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        StringBuilder frequency = new StringBuilder();


        while(s.hasNext()){
            String line = s.nextLine();
            list.addAll(Arrays.asList(line.replaceAll("[^a-zA-z ]", "").toLowerCase().split("\\s+")));
        }

        for(String i : list){
            Integer j = hashMap.get(i);
            hashMap.put(i,  (j == null) ? 1 : j + 1);
        }

        Map<String, Integer> sortedHashMap = hashMap.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<String, Integer> value : sortedHashMap.entrySet()){
            frequency.append(value.getKey()).append(", ").append(value.getValue()).append("\n");
        }

        s.close();
        return frequency.toString();
    }
}
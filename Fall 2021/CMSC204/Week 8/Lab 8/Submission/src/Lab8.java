import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Brandon Tenorio
 */
public class Lab8{

    public static void readBinaryFile(DataInputStream fromBinaryFile) throws IOException {
        fromBinaryFile.readInt();
    }

    public static void writeToBinaryFile(String toBinaryFile) throws FileNotFoundException, IOException{
        ArrayList<Integer> list = new ArrayList<>();

        // Create a File object
        File file = new File(toBinaryFile);

        // Create FileOutputStream object
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        // Create DataOutputStream object
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        int max = 9999;
        int min = 1000;

        // Filling array list with the integers
        for(int i = 0; i < 49999; i++){
            list.add(ThreadLocalRandom.current().nextInt(min, max + 1));
        }
        // Writing to the binary file
        for (Integer integer : list) {
            dataOutputStream.writeInt(integer);
        }

        System.out.println("Done writing to binary file. Closing the file.");
        dataOutputStream.close();
    }


    public static void writeToTextFile(String fileName) throws IOException{
        ArrayList<Integer> list = new ArrayList<>();

        // Create File object
        File file = new File(fileName);

        // Create FileWriter object
        FileWriter fileWriter = new FileWriter(file);

        // Create PrintWriter object
        PrintWriter printWriter = new PrintWriter(fileWriter);

        int max = 9999;
        int min = 1000;

        // Filling array list with integers
        for(int i = 0; i < 49999; i++){
            list.add(ThreadLocalRandom.current().nextInt(min, max + 1));
        }

        // Writing to the text file
        for (Integer integer : list) {
            printWriter.println(integer);
        }

        System.out.println("Done writing to binary file. Closing the file.");
        printWriter.close();
    }
}
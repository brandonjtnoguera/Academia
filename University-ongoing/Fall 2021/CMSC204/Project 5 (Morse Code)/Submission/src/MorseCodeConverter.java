import java.io.*;
import java.util.*;

/**
 * @author Brandon Tenorio
 */
public class MorseCodeConverter {
    private static MorseCodeTree morseCodeTree = new MorseCodeTree();

    /**
     * Returns a string with all the data in the tree in LNR order with a space in between them.
     * Uses the toArrayList method in MorseCodeTree It should return the data in this order:
     * "h s v i f u e l r a p w j b d x n c k y t z g q m o"
     * Note the extra space between j and b - that is because there is an empty string that is the root, and in the LNR traversal, the root would come between the
     * right most child of the left tree (j) and the left most child of the right tree (b).
     * This is used for testing purposes to make sure the MorseCodeTree has been built properly
     * @return the data in the tree in LNR order separated by a space.
     */
    public static String printTree(){
        ArrayList<String> tree = morseCodeTree.toArrayList();
        StringBuilder treeAsStringBuilder = new StringBuilder();
        for(String letter : tree) treeAsStringBuilder.append(letter).append(" ");
        return treeAsStringBuilder.toString().trim();
    }

    /**
     * Converts Morse Code into English. Each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
     * Example:
     * code = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.."
     * string returned = "Hello World"
     * @param code the morse code
     * @return the English translation of the morse code
     */
    public static String convertToEnglish(String code){
        String[] morseCodeCharacters;
        String[] encodedMessage = code.split(" / ");
        StringBuilder decodedMessage = new StringBuilder();

        for(String temp: encodedMessage) {
            morseCodeCharacters = temp.split(" ");
            for(String tempLetter: morseCodeCharacters) decodedMessage.append(morseCodeTree.fetch(tempLetter));
            decodedMessage.append(" ");
        }
        return decodedMessage.toString().trim();
    }

    /**
     * Converts a file of Morse code into English Each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
     * Example:
     * a file that contains ".... . .-.. .-.. --- / .-- --- .-. .-.. -.."
     * string returned = "Hello World"
     * @param codeFile name of the file that contains Morse Code
     * @return the English translation of the file
     * @throws FileNotFoundException thrown if file not found
     */
    public static String convertToEnglish(File codeFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(codeFile);
        StringBuilder decodedMessage = new StringBuilder();

        while(scanner.hasNextLine()) decodedMessage.append(scanner.nextLine()).append("\n");
        scanner.close();

        return convertToEnglish(decodedMessage.toString().trim());
    }
}

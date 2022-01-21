import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * @author Brandon Tenorio
 */
public class MorseCodeConverterStudentTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void convertToEnglish(){
        assertEquals("i like playing guitar", MorseCodeConverter.convertToEnglish
                (".. / .-.. .. -.- . / .--. .-.. .- -.-- .. -. --. / --. ..- .. - .- .-."));

        assertEquals("i want to make my parents proud", MorseCodeConverter.convertToEnglish
                (".. / .-- .- -. - / - --- / -- .- -.- . / -- -.-- / .--. .- .-. . -. - ... / .--. .-. --- ..- -.."));

        assertEquals("i want to work for a gaming company or discord", MorseCodeConverter.convertToEnglish
                (".. / .-- .- -. - / - --- / .-- --- .-. -.- / ..-. --- .-. / .- / --. .- -- .. -. --. / -.-. --- -- .--. .- -. -.-- / --- .-. / -.. .. ... -.-. --- .-. -.."));
    }

    @Test
    public void convertToEnglishFromFile() throws FileNotFoundException {
        assertEquals("give me your answer do", MorseCodeConverter.convertToEnglish(new File("rsrcs/Daisy.txt")));
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Brandon Tenorio
 */

public class MorseCodeTreeStudentTest {

    MorseCodeTree morseCodeTree = new MorseCodeTree();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void fetch() {
        assertEquals("b", morseCodeTree.fetch("-..."));
        assertEquals("r", morseCodeTree.fetch(".-."));
        assertEquals("a", morseCodeTree.fetch(".-"));
        assertEquals("n", morseCodeTree.fetch("-."));
        assertEquals("d", morseCodeTree.fetch("-.."));
        assertEquals("o", morseCodeTree.fetch("---"));
        assertEquals("n", morseCodeTree.fetch("-."));
    }

    @Test
    public void toArrayList() {
        assertEquals("[h, s, v, i, f, u, e, l, r, a, p, w, j, , b, d, x, n, c, k, y, t, z, g, q, m, o]",
                morseCodeTree.toArrayList().toString());
    }
}
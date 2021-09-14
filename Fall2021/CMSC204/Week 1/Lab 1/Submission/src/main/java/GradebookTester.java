import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GradebookTester {
    GradeBook g1;
    GradeBook g2;

    @Before
    public void setUp(){
        g1 = new GradeBook(4);
        g1.addScore(69.42);
        g1.addScore(78.56);
        g1.addScore(58.91);
        g1.addScore(96.78);

        g2 = new GradeBook(4);
        g2.addScore(42.69);
        g2.addScore(56.78);
        g2.addScore(90.85);
        g2.addScore(78.96);
    }

    @After
    public void tearDown(){
        g1 = null;
        g2 = null;
    }

    @Test
    public void addScore(){
        assertEquals("69.42 78.56 58.91 96.78", g1.toString());
        assertEquals("42.69 56.78 90.85 78.96", g2.toString());

        assertEquals(4, g1.getScoresSize());
        assertEquals(4, g2.getScoresSize());
    }

    @Test
    public void sum(){
        assertEquals(303.67, g1.sum());
        assertEquals(269.28, g2.sum());
    }

    @Test
    public void minimum(){
        assertEquals(58.91, g1.minimum());
        assertEquals(42.69, g2.minimum());
    }

    @Test
    public void finalScores(){
        assertEquals(244.76, g1.finalScore());
        assertEquals(226.59, g2.finalScore());
    }

    @Test
    public void getScoresSize(){

    }

//    @Test
//    public void toString(){
//    }



}
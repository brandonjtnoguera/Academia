import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Student tests of Notation.java
 * @author Brandon Tenorio
 */
public class NotationSTUDENT_Test {
    ArrayList<String> infixExpressions = new ArrayList<>();
    ArrayList<String> postfixExpressions = new ArrayList<>();
    ArrayList<String> evaluatePostfixExpressions = new ArrayList<>();
    ArrayList<String> evaluationAnswers = new ArrayList<>();
    ArrayList<String> invalidExpressions = new ArrayList<>();

    @Before
    public void setUp() throws Exception {

        /* Expressions taken from
        * http://www.cs.kent.edu/~nmadi/CS23001/fix-Quiz.pdf
        * https://web.stonehill.edu/compsci/CS104/Stuff/Infix%20and%20%20postfix%20expressions.pdf
        * */
        
        infixExpressions.add("(A+(B*C))");
        infixExpressions.add("((A+(B*C))/(D-E))");
        infixExpressions.add("((A+B)*(C+E))");
        infixExpressions.add("(A*(B*(((C+A)+B)*C)))");
        infixExpressions.add("((H*((((A+((B+C)*D))*F)*G)*E))+J)");

        invalidExpressions.add("(A(+(B*C))");
        invalidExpressions.add("ABC*+/");
        invalidExpressions.add("23+/");

        postfixExpressions.add("ABC*+");
        postfixExpressions.add("ABC*+DE-/");
        postfixExpressions.add("AB+CE+*");
        postfixExpressions.add("ABCA+B+C***");
        postfixExpressions.add("HABC+D*+F*G*E**J+");

        evaluatePostfixExpressions.add("23+");
        evaluatePostfixExpressions.add("234*+");
        evaluatePostfixExpressions.add("34*25*+");
        evaluatePostfixExpressions.add("342+*5*");
        evaluatePostfixExpressions.add("23*73/");
        evaluatePostfixExpressions.add("23*45*+");
        evaluatePostfixExpressions.add("23-4+56*-");
        evaluatePostfixExpressions.add("23-4+567*+*");

        evaluationAnswers.add("5.0");
        evaluationAnswers.add("14.0");
        evaluationAnswers.add("22.0");
        evaluationAnswers.add("90.0");
        evaluationAnswers.add("2.3333333333333335");
        evaluationAnswers.add("26.0");
        evaluationAnswers.add("-27.0");
        evaluationAnswers.add("141.0");
    }

    @After
    public void tearDown() throws Exception {
        postfixExpressions = null;
        infixExpressions = null;
        evaluationAnswers = null;
        evaluatePostfixExpressions = null;
    }

    @Test(expected = InvalidNotationFormatException.class)
    public void evaluatePostfixExpression() {
        for(int i =0; i < 8; i++){
            assertEquals(Double.parseDouble(evaluationAnswers.get(i)), Notation.evaluatePostfixExpression(evaluatePostfixExpressions.get(i)), .001);
        }
        // Throws exception
        assertEquals(evaluationAnswers.get(0), Notation.convertPostfixToInfix(invalidExpressions.get(1)));
    }

    @Test(expected = InvalidNotationFormatException.class)
    public void convertPostfixToInfix() {
        for(int i =0; i < 5; i++){
            assertEquals(infixExpressions.get(i), Notation.convertPostfixToInfix(postfixExpressions.get(i)));
        }
        // Throws exception
        assertEquals(infixExpressions.get(0), Notation.convertPostfixToInfix(invalidExpressions.get(1)));
    }

    @Test(expected = InvalidNotationFormatException.class)
    public void convertInfixToPostfix() {
        for(int i =0; i < 5; i++){
            assertEquals(postfixExpressions.get(i), Notation.convertInfixToPostfix(infixExpressions.get(i)));
        }
        // Throws exception
        assertEquals(postfixExpressions.get(0), Notation.convertInfixToPostfix(invalidExpressions.get(0)));
    }
}
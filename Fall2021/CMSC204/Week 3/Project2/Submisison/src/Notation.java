/**
 * Utility class in charge of converting notations
 * @author Brandon Tenorio
 */
public class Notation {
    /**
     * Evaluates the result of a given expression in postfix
     * @param postfixExpr expression to be evaluated
     * @return the value of the expression passed in
     * @throws InvalidNotationFormatException if the expression is invalid
     */
    public static double evaluatePostfixExpression(String postfixExpr) throws InvalidNotationFormatException{
        NotationStack<Double>  valueStackOfDoubles = new NotationStack<>(postfixExpr.length());
        NotationStack<Integer>  valueStackOfInts = new NotationStack<>(postfixExpr.length());

        int i = 0;
        while(i < postfixExpr.length()){
            char nextChar = postfixExpr.charAt(i);
            switch (nextChar){
                case '0','1','2','3','4','5','6','7','8','9' -> {
                    int value = Character.digit(nextChar, 10);
                     valueStackOfInts.push(value);
                }
                case '+' -> {
                    int operandOne =  valueStackOfInts.pop();
                    if( valueStackOfInts.isEmpty()) throw new InvalidNotationFormatException();
                    int operandTwo =  valueStackOfInts.pop();
                    double result = operandTwo + operandOne;
                     valueStackOfDoubles.push(result);
                }
                case '-' -> {
                    int operandOne =  valueStackOfInts.pop();
                    if( valueStackOfInts.isEmpty()) throw new InvalidNotationFormatException();
                    int operandTwo =  valueStackOfInts.pop();
                    double result = operandTwo - operandOne;
                     valueStackOfDoubles.push(result);
                }
                case '*' -> {
                    int operandOne =  valueStackOfInts.pop();
                    if( valueStackOfInts.isEmpty()) throw new InvalidNotationFormatException();
                    int operandTwo =  valueStackOfInts.pop();
                    double result = operandTwo * operandOne;
                     valueStackOfDoubles.push(result);
                }
                case '/' -> {
                    int operandOne =  valueStackOfInts.pop();
                    if( valueStackOfInts.isEmpty()) throw new InvalidNotationFormatException();
                    int operandTwo =  valueStackOfInts.pop();
                    double result = operandTwo / operandOne;
                     valueStackOfDoubles.push(result);
                }
                case '^' -> {
                    int operandOne =  valueStackOfInts.pop();
                    if( valueStackOfInts.isEmpty()) throw new InvalidNotationFormatException();
                    int operandTwo =  valueStackOfInts.pop();
                    double result = Math.pow(operandTwo,operandOne);
                     valueStackOfDoubles.push(result);
                }
            }
            i++;
        }
        if(valueStackOfDoubles.isEmpty()) throw new InvalidNotationFormatException();
        return valueStackOfDoubles.top();
    }

    /**
     * Converts a given string in postfix to infix
     * @param postfix expression to be converted
     * @return infix version of postfix expression given
     * @throws InvalidNotationFormatException thrown if postfix expression is invalid
     */
    public static String convertPostfixToInfix(String postfix) throws InvalidNotationFormatException{
        NotationStack<String> operandStack = new NotationStack<>(postfix.length());
        StringBuilder infix = new StringBuilder();

        int i = 0;
        while(i < postfix.length()){
            String nextChar = String.valueOf(postfix.charAt(i));
            switch(nextChar){
                case "0","1","2","3","4","5","6","7","8","9",
                        "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                        "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
                        -> operandStack.push(nextChar);
                case "+" -> {
                    String firstVal = operandStack.pop();
                    if(operandStack.isEmpty()) throw new InvalidNotationFormatException();
                    String secondVal = operandStack.pop();
                    String result = "(" + secondVal + "+" + firstVal + ")";
                    operandStack.push(result);
                }
                case "-" -> {
                    String firstVal = operandStack.pop();
                    if(operandStack.isEmpty()) throw new InvalidNotationFormatException();
                    String secondVal = operandStack.pop();
                    String result = "(" + secondVal + "-" + firstVal + ")";
                    operandStack.push(result);
                }
                case "*" -> {
                    String firstVal = operandStack.pop();
                    if(operandStack.isEmpty()) throw new InvalidNotationFormatException();
                    String secondVal = operandStack.pop();
                    String result = "(" + secondVal + "*" + firstVal + ")";
                    operandStack.push(result);
                }
                case "/" -> {
                    String firstVal = operandStack.pop();
                    if(operandStack.isEmpty()) throw new InvalidNotationFormatException();
                    String secondVal = operandStack.pop();
                    String result = "(" + secondVal + "/" + firstVal + ")";
                    operandStack.push(result);
                }
                case "^" -> {
                    String firstVal = operandStack.pop();
                    if(operandStack.isEmpty()) throw new InvalidNotationFormatException();
                    String secondVal = operandStack.pop();
                    String result = "(" + secondVal + "^" + firstVal + ")";
                    operandStack.push(result);
                }
            }
            i++;
        }

        infix.append(operandStack.pop());

        return infix.toString();
    }

    /**
     *Converts infix expression to its postfix equivalent
     * @param infix String to be converted
     * @return postfix expression of infix parameter
     * @throws InvalidNotationFormatException if notation is invalid
     */
    public static String convertInfixToPostfix(String infix) throws InvalidNotationFormatException{
        NotationStack<Character> operatorStack = new NotationStack<>(infix.length());
        StringBuilder postfix = new StringBuilder();
        char topOperator;

        int i =0;
        while(i < infix.length()){
            char nextChar = infix.charAt(i);
            switch (nextChar) {
                // If next char is an alphanumeric character
                case '0','1','2','3','4','5','6','7','8','9',
                        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
                        -> postfix.append(nextChar);
                case '^', '(' -> operatorStack.push(nextChar);
                case '+', '-', '*', '/' -> {
                    while (!operatorStack.isEmpty() && precedenceOf(nextChar) <= precedenceOf(operatorStack.top())) {
                        postfix.append(operatorStack.top());
                        operatorStack.pop();
                    }
                    operatorStack.push(nextChar);
                }
                case ')' -> {
                    topOperator = operatorStack.pop();
                    while (topOperator != ')') {
                        if(topOperator == '(') break;
                        postfix.append(topOperator);
                        if(operatorStack.isEmpty()) throw new InvalidNotationFormatException();
                        else topOperator = operatorStack.pop();

                    }
                }
                default -> {
                }
            }
            i++;
        }
        while (!operatorStack.isEmpty()){
            topOperator = operatorStack.pop();
            postfix.append(topOperator);
        }

        if(!operatorStack.isEmpty()) throw new InvalidNotationFormatException();
        else if(postfix.toString().contains("(") || postfix.toString().contains(")")) throw new InvalidNotationFormatException();
        return postfix.toString();
    }

    /**
     * Determines the precedence of operators in postix, infix, and prefix expressions
     * @param c the operator whose precedence will be determined
     * @return 0 for addition and subtraction, 1 for multiplication and division, 2 for exponentiation, -1 if it's not an operator
     */
    private static int precedenceOf(char c){
        return switch (c) {
            case '+', '-' -> 0; // Low precedence
            case '*', '/' -> 1;
            case '^' -> 2;  // High precedence
            default -> -1;
        };
    }
}

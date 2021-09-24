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
        NotationStack<Integer> stack = new NotationStack<>(postfixExpr.length());

        for(int i =0; i < postfixExpr.length(); i++){
            char nextChar = postfixExpr.charAt(i);
            if(nextChar == ' ') continue;
            else if(Character.isDigit(nextChar)) stack.push(nextChar - '0');
            else{
                int operatorOne = stack.pop();
                int operatorTwo = stack.pop();
                switch (nextChar){
                    case '+' -> stack.push(operatorTwo + operatorOne);
                    case '-' -> stack.push(operatorTwo - operatorOne);
                    case '*' -> stack.push(operatorTwo * operatorOne);
                    case '/' -> stack.push(operatorTwo / operatorOne);
                    case '%' -> stack.push(operatorTwo % operatorOne);
                    case '^' -> stack.push((int)Math.pow(operatorTwo, operatorOne));
                }
            }
        }
        return stack.pop();
    }

    /**
     * Converts a given string in postfix to infix
     * @param postfix expression to be converted
     * @return infix version of postfix expression given
     * @throws InvalidNotationFormatException thrown if postfix expression is invalid
     */
    public static String convertPostfixToInfix(String postfix) throws InvalidNotationFormatException{
        NotationStack<String> stack = new NotationStack<>(postfix.length());
        for(int i = 0; i < postfix.length(); i++){
            if(isOperand(postfix.charAt(i))) stack.push(postfix.charAt(i) + "");
            else{
                String operandOne = stack.pop();
                if(stack.isEmpty()) throw new InvalidNotationFormatException();
                String operandTwo = stack.pop();
                stack.push("(" + operandTwo + postfix.charAt(i) + operandOne + ")");
            }
        }
        if(stack.size() > 1) throw new InvalidNotationFormatException();
        return stack.pop();
    }

    /**
     *Converts infix expression to its postfix equivalent
     * @param infix String to be converted
     * @return postfix expression of infix parameter
     * @throws InvalidNotationFormatException if notation is invalid
     */
    public static String convertInfixToPostfix(String infix) throws InvalidNotationFormatException{
        NotationStack<Character> stack = new NotationStack<>(infix.length());
        StringBuilder postfix = new StringBuilder();

        for(int i = 0; i < infix.length(); i++){
            char nextChar = infix.charAt(i);
            if(Character.isLetterOrDigit(nextChar)) postfix.append(nextChar);   // If letter or number is found
            else if(nextChar == '(') stack.push(nextChar);  // If opening parentheses is found
            else if(nextChar == ')'){   // If closing parentheses is found
                while(!stack.isEmpty() && stack.top() != '('){
                    postfix.append(stack.pop());
                }
            }
            else{   // If we get something like "*/" or "+*"
                while(!stack.isEmpty() && precedenceOf(nextChar) <= precedenceOf(stack.top())){
                    postfix.append(stack.pop());
                }
                stack.push(nextChar);
            }
        }
        while(!stack.isEmpty()){
            if(stack.top() == '(') throw new InvalidNotationFormatException();
            postfix.append(stack.pop());
        }
        if(!stack.isEmpty()) throw new InvalidNotationFormatException();
        return postfix.toString();
    }

    /**
     * Determines the precedence of operators in postfix, infix, and prefix expressions
     * @param c the operator whose precedence will be determined
     * @return 0 for addition and subtraction, 1 for multiplication and division, 2 for exponentiation, -1 if it's not an operator
     */
    private static int precedenceOf(char c){
        return switch (c) {
            case '+', '-' -> 0; // Low precedence
            case '*', '/', '%' -> 1;
            case '^' -> 2;  // High precedence
            default -> -1;
        };
    }

    /**
     * Determines if char c is an operand
     * @param c character to be determined operand or not
     * @return true if it's an operand, false otherwise
     */
    private static boolean isOperand(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}

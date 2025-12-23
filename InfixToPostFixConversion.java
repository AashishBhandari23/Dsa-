// import java.util.Stack;

// public class InfixToPostFixConversion {
// /**
//  * Determines the precedence of an operator
//  * @param op  The operator character
//  * @return An integer representing the precedence 
//  */

//     private static int getPrecedence(char op){
//         switch (op) {
//             case '+':
//                 case '-':
//                 return 1;

//                 case '*':
//                     case '/':    
//                     return 2; 

//                     case '^':
//                         case '$':
//                             return 3;
//             default:
//                 return 0;
//         }
//     }
//     public static String convertToPostFix(String infixExpression)  {
//         StringBuilder postfixResult = new StringBuilder();
//         Stack<character> operatoStack = new Stack<>();
//     }
//     }
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFixConversion {

    // Determines precedence of operators
    private static int getPrecedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1; // Lowest precedence
            case '*':
            case '/':
                return 2; // Medium precedence
            case '^':
            case '$':
                return 3; // Highest precedence
            default:
                return 0;
        }
    }

    // Converts infix expression to postfix
    public static String convertToPostFix(String infixExpression) {
        StringBuilder postFixResult = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char token = infixExpression.charAt(i);

            // Ignore spaces
            if (Character.isWhitespace(token)) {
                continue;
            }

            // Case 1: Operand → directly append
            if (Character.isLetterOrDigit(token)) {
                postFixResult.append(token);
            } // Case 2: Opening parenthesis → push
            else if (token == '(') {
                operatorStack.push(token);
            } // Case 3: Closing parenthesis → pop until '('
            else if (token == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postFixResult.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop(); // discard '('
                }
            } // Case 4: Operator
            else {
                while (!operatorStack.isEmpty()
                        && getPrecedence(operatorStack.peek()) >= getPrecedence(token)) {
                    postFixResult.append(operatorStack.pop());
                }
                operatorStack.push(token);
            }
        }

        // Pop remaining operators
        while (!operatorStack.isEmpty()) {
            postFixResult.append(operatorStack.pop());
        }

        return postFixResult.toString();
    }

    // Test
    public static void main(String[] args) {
         Scanner infixExp = new Scanner(System.in);
        System.out.println("Enter infix Expression");
        String infix = infixExp.nextLine();
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + convertToPostFix(infix));
    }
}




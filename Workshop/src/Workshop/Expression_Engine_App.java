package Workshop;

import java.util.*;

//Interface for evaluators
interface ExpressionEvaluator {
 String convert(String expression);
 int evaluate(String expression);
}

//Postfix evaluator using stack (OOP: Encapsulation & Polymorphism)
class PostfixEvaluator implements ExpressionEvaluator {

 private boolean isOperator(char ch) {
     return "+-*/^".indexOf(ch) != -1;
 }

 private int precedence(char op) {
     return switch (op) {
         case '+', '-' -> 1;
         case '*', '/' -> 2;
         case '^' -> 3;
         default -> -1;
     };
 }

 // Convert Infix → Postfix using Shunting Yard algorithm
 @Override
 public String convert(String infix) {
     StringBuilder postfix = new StringBuilder();
     Stack<Character> stack = new Stack<>();

     for (char ch : infix.replaceAll("\\s+", "").toCharArray()) {
         if (Character.isDigit(ch)) {
             postfix.append(ch);
         } else if (ch == '(') {
             stack.push(ch);
         } else if (ch == ')') {
             while (!stack.isEmpty() && stack.peek() != '(') {
                 postfix.append(stack.pop());
             }
             stack.pop(); // pop '('
         } else if (isOperator(ch)) {
             while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                 postfix.append(stack.pop());
             }
             stack.push(ch);
         }
     }

     while (!stack.isEmpty()) {
         postfix.append(stack.pop());
     }

     return postfix.toString();
 }

 // Evaluate Postfix expression
 @Override
 public int evaluate(String postfix) {
     Stack<Integer> stack = new Stack<>();

     for (char ch : postfix.toCharArray()) {
         if (Character.isDigit(ch)) {
             stack.push(ch - '0');
         } else {
             int b = stack.pop();
             int a = stack.pop();
             int result = switch (ch) {
                 case '+' -> a + b;
                 case '-' -> a - b;
                 case '*' -> a * b;
                 case '/' -> a / b;
                 case '^' -> (int) Math.pow(a, b);
                 default -> 0;
             };
             stack.push(result);
         }
     }

     return stack.pop();
 }
}

//Future support for PrefixEvaluator (Polymorphism)
class PrefixEvaluator implements ExpressionEvaluator {
 @Override
 public String convert(String expression) {
     // TODO: Implement prefix conversion
     return "Prefix conversion not implemented.";
 }

 @Override
 public int evaluate(String expression) {
     // TODO: Implement prefix evaluation
     return 0;
 }
}

//Main driver
public class Expression_Engine_App {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ExpressionEvaluator evaluator = new PostfixEvaluator();

     System.out.println("Expression Evaluation Engine (Infix → Postfix + Evaluate)");
     System.out.print("Enter infix expression (e.g., (3+4)*5): ");
     String infix = sc.nextLine();

     String postfix = evaluator.convert(infix);
     System.out.println("Postfix: " + postfix);

     int result = evaluator.evaluate(postfix);
     System.out.println("Result: " + result);

     sc.close();
 }
}

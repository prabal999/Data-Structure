package com.ph.datastructure.stack;

import com.ph.datastructure.BasicStack;

/**
 * Check for balanced parentheses in a givan string. 1) Declare a character stack S. 2) Now traverse
 * the expression string exp. a) If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘)
 * then push it to stack. b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then
 * pop from stack and if the popped character is the matching starting bracket then fine else
 * parenthesis are not balanced. 3) After complete traversal, if there is some starting bracket left
 * in stack then “not balanced”
 * 
 * @author Prabal Srivastava
 */
public class BalancedParentheses {

    public static void main(String... strings) {
        
        BalancedParentheses balParen = new BalancedParentheses();
        String inputData = "{Hello}[Horld](!)";
        System.out.println(inputData + " : is balanced : " + balParen.checkBalance(inputData));
        
        inputData = "{Hel(lo}[Horld](!)";
        System.out.println(inputData + " : is balanced : " + balParen.checkBalance(inputData));
    }

    private boolean checkBalance(final String inputData) {
        boolean balanced = false;
        if(null != inputData) {
            BasicStack<Character> stack = new BasicStack<Character>(inputData.length());
            char[] inputChars = inputData.toCharArray();
            for(int i = 0; i < inputChars.length; i++) {
                if('(' == inputChars[i] || '{' == inputChars[i] || '[' == inputChars[i]) {
                    stack.push(inputChars[i]);
                } else if(')' == inputChars[i] || '}' == inputChars[i] || ']' == inputChars[i]) {
                    char data = stack.pop();// stack.peek();
                    if((inputChars[i] == ')' && data == '(')
                       || (inputChars[i] == '{' && data == '}')
                       || (inputChars[i] == '[' && data == ']')) {
                        //stack.pop();
                        continue;
                    }
                }

            }
            if(stack.isEmply()) {
                balanced = true;
            }
        }
        return balanced;
    }
}

package com.ph.datastructure.stack;

import com.ph.datastructure.BasicStack;

/**
 * Following is simple algorithm to reverse a string using stack. 1) Create an empty stack. 2) One
 * by one push all characters of string to stack. 3) One by one pop all characters from stack and
 * put them back to string.
 * 
 * @author Prabal Srivastava
 */
public class ReverseString {

    public static void main(String... strings) {
        StringBuilder data = new StringBuilder("Hello world!");
        data = reverse(data);
        System.out.println(data);
        data = reverse(data);
        System.out.println(data);
    }

    public static StringBuilder reverse(final StringBuilder data) {
        BasicStack<Character> stack = new BasicStack<Character>(data.length());
        for(int i = 0; i < data.length(); i++) {
            stack.push(data.charAt(i));
        }
        for(int i = 0; i < data.length(); i++) {
            data.setCharAt(i, stack.pop());
        }
        return data;
    }

}

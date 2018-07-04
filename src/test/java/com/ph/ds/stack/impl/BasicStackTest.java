/**
 * 
 */
package com.ph.ds.stack.impl;

import org.junit.Test;

import com.ph.ds.stack.Stack;

/**
 * @author Prabal Srivastava
 *
 */
public class BasicStackTest {

	private final int defaultStackSize = 10;

	private final int maxStackSize = 18;

	private final int minStackSize = 1;

	@Test(expected = StackOverflowError.class)
	public void testDefaultConstaction() {
		Stack<Integer> basicStack = new BasicStack<>();
		// default size of a stack suold be 10.
		for (int i = 0; i < 9; i++) {
			basicStack.push(i);
		}
		// pushing next item will throw {@link StackOverflowError}
		//basicStack.push(99);
	}

}

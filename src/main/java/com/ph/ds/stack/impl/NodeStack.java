package com.ph.ds.stack.impl;

import java.io.Serializable;
import java.util.EmptyStackException;

import com.ph.ds.stack.Stack;

public class NodeStack<X> implements Stack<X> {

	/**
	 * Auto generated serial version for {@link Serializable} this object. use
	 * serialVersionUID from JDK 1.0.2 for interoperability
	 */
	private static final long serialVersionUID = 7275642224005434123L;

	private StackNode<X> top;

	@Override
	public void push(X item) {
		StackNode<X> t = new StackNode<X>(item);
		t.next = top;
		top = t;
	}

	@Override
	public X pop() {
		if (top == null)
			throw new EmptyStackException();
		X item = top.data;
		top = top.next;
		return item;
	}

	@Override
	public X peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public boolean isFull() {
		// No need to implement this one
		return false;
	}

	private static class StackNode<X> {
		private X data;
		private StackNode<X> next;

		@SuppressWarnings("unused")
		public StackNode(X data) {
			this.data = data;
		}
	}
}

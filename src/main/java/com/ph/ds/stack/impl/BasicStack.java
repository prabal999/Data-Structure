package com.ph.ds.stack.impl;

import java.io.Serializable;
import java.util.EmptyStackException;

import com.ph.ds.stack.Stack;

/**
 * This class is created using fixed Array, so that why this is basic. If the
 * size reaches more then initial size, then it will throw
 * {@link StackOverflowError}.
 * 
 * @author Prabal Srivastava
 *
 * @param <X>
 */
public class BasicStack<X> implements Stack<X> {

	/**
	 * Auto generated serial version for {@link Serializable} this object. use
	 * serialVersionUID from JDK 1.0.2 for interoperability
	 */
	private static final long serialVersionUID = -6717465172597956715L;
	private X[] items;
	private int size = 10;

	@SuppressWarnings("unchecked")
	public BasicStack() {
		this.size = 0;
		this.items = (X[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public BasicStack(final int stackSize) {
		this.size = 0;
		this.items = (X[]) new Object[stackSize];
	}

	public void push(X item) {
		if (isFull()) {
			throw new StackOverflowError();
		}
		items[size] = item;
		size++;
	}

	public X pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		X item = items[size]; // For top most item to retrieve
		items[size] = null; // For making eligible to GC
		size--;
		return item;
	}

	public X peek() {
		return items[size]; // For top most item to retrieve;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == items.length - 1;
	}

}

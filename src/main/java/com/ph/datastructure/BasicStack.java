package com.ph.datastructure;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class BasicStack<X> {
	private X[] stackData;
	private int stackPointer;
	private int size;

	@SuppressWarnings("unchecked")
	public BasicStack(int size) {
		stackData = (X[]) new Object[size];
		stackPointer = 0;
		this.size = size;
	}

	// Big-O notation is O(1) constant.
	public int size() {
		return stackPointer;
	}

	// Big-O notation is O(1) constant.
	public boolean isEmply() {
		if (stackPointer == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Big-O notation is O(1) constant.
	public void push(X data) {
		if (stackPointer == size) {
			throw new StackOverflowError("Stack is full.");
		}
		stackData[stackPointer++] = data;
	}

	// Big-O notation is O(1) constant.
	public X pop() {
		X data = null;
		if (isEmply()) {
			throw new IllegalAccessError("Stack is empty. Nothing to popout.");
		}
		data = stackData[--stackPointer];
		stackData[stackPointer] = null;
		return data;
	}

	// Big-O notation is O(n) linear.
	public int search(X data) {
		if (isEmply()) {
			throw new IllegalAccessError("Stack is empty. Nothing to popout.");
		}
		for (int i = 0; i < stackPointer; i++) {
			if (data.equals(stackData[i])) {
				return i;
			}
		}
		throw new OBJECT_NOT_EXIST("Object not found");
	}

	// Big-O notation is O(n) linear
	public X access(X data) {
		if (isEmply()) {
			throw new IllegalAccessError("Stack is empty. Nothing to popout.");
		}
		X tempObject = null;
		while (stackPointer > 0) {
			tempObject = pop();
			if (data.equals(tempObject)) {
				return tempObject;
			}
		}
		throw new OBJECT_NOT_EXIST("Object not found");
	}

}

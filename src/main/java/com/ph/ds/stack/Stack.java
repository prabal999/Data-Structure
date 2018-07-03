package com.ph.ds.stack;

import java.io.Serializable;

/**
 * Last in first out (LIFO) or First in last out (FILO)
 * 
 * @author Prabal Srivastava
 *
 * @param <X>
 */
public interface Stack<X> extends Serializable, Cloneable{
	
	void push(X item);

	X pop();

	X peek();

	boolean isEmpty();

	boolean isFull();
}

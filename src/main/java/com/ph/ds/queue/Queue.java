package com.ph.ds.queue;

import java.io.Serializable;

/**
 * First in first out (FIFO) or Last in last out (LIFO)
 * 
 * @author Prabal Srivastava
 *
 * @param <X>
 */
public interface Queue<X> extends Serializable, Cloneable{
	
	void add(X item);

	X remove();

	X peek();

	boolean isEmpty();

	boolean isFull();
}

package com.ph.ds.queue.impl;

import java.io.Serializable;
import java.util.NoSuchElementException;

import com.ph.ds.queue.Queue;

public class NodeQueue<X> implements Queue<X> {

	/**
	 * Auto generated serial version for {@link Serializable} this object. use
	 * serialVersionUID from JDK 1.0.2 for interoperability
	 */
	private static final long serialVersionUID = 964320477778969194L;

	private Node<X> first;
	private Node<X> last;

	@Override
	public void add(X item) {
		Node<X> newNode = new Node<X>(item);
		if (last != null) {
			last.next = newNode;
		} else {
			last = newNode;
		}

		if (first == null) {
			first = last;
		}
	}

	@Override
	public X remove() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		X item = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return item;
	}

	@Override
	public X peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public boolean isFull() {
		// always return false in this implementation.
		return false;
	}

	private class Node<X> {
		private X data;
		private Node<X> next;

		public Node(X data) {
			this.data = data;
		}
	}

}

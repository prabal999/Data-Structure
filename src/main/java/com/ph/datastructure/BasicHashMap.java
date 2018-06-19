package com.ph.datastructure;

public class BasicHashMap<K, V> {
	private Node<K, V>[] table;
	private int capacity;
	private int size;

	@SuppressWarnings("unchecked")
	public BasicHashMap(int capacity) {
		table = new Node[capacity];
		this.capacity = capacity;
		this.size = 0;
	}

	public int hashCode(K key) {
		return key.hashCode() % capacity;
	}

	public void put(K key, V value) {
		boolean updated = false;
		int hash = hashCode(key);
		Node<K, V> node = new Node<K, V>(key, value, null);
		if (null == table[hash]) {
			table[hash] = node;
		} else {
			Node<K, V> current = table[hash];
			while (current.getNext() != null) {
				if (current.key.equals(node.getKey())) {
					current.setValue(node.getValue());
					updated = true;
					break;
				} else {
					current = current.getNext();
				}
			}
			if (!updated) {
				current.setNext(node);
				size++;
			}
		}
	}

	public V get(K key) {
		V value = null;
		int hash = hashCode(key);
		if (null != table[hash]) {
			Node<K, V> current = table[hash];
			while (current != null) {
				if (current.getKey().equals(key)) {
					value = current.getValue();
					break;
				}
				current = current.getNext();
			}
		}
		return value;
	}

	public boolean remove(K key) {
		boolean removed = false;
		int hash = hashCode(key);
		if (null != table[hash]) {
			Node<K, V> previous = null;
			Node<K, V> current = table[hash];
			while (current != null) {
				if (current.getKey().equals(key)) {
					if (previous == null) {
						table[hash] = current.getNext();
						current = null;
					} else {
						previous.setNext(current.getNext());
					}
					size--;
					removed = true;
					break;
				}
				previous = current;
				current = current.getNext();
			}
		}
		return removed;
	}

	@Override
	public String toString() {
		String map = "";
		for (int i = 0; i < table.length; i++) {
			if (null != table[i]) {
				map += "\n position = " + i + " = {";
				Node<K, V> current = table[i];
				while (current != null) {
					map += " Key = " + current.getKey() + "; Value = " + current.getValue();
					current = current.getNext();
				}
			}
		}
		return map;
	}

	private class Node<K, V> {
		private K key;
		private V value;
		private Node<K, V> next;

		public Node(K key, V value, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Node<K, V> getNext() {
			return next;
		}

		public void setNext(Node<K, V> next) {
			this.next = next;
		}
	}

}

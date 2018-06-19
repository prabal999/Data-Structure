package com.ph.ds;

// Same like queue.
public class BasicLinkedList<X> {

    private Node first;

    private Node last;

    private int nodeCount;

    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    //Big-O notation is O(1)
    public void add(X item) {
        //check if the list is empty
        if(first == null) {
            first = new Node(item);
            last = first;
        }

        //check if more than one node
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    //big O notation is O(n)
    public void insertAt(X item, int position) {
        if(size() < position) {
            throw new IllegalAccessError("Given position is greater than size.");
        }
        Node currentNode = first;
        for(int i = 0; i < position && currentNode.getNextNode() != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        newNode.setNextNode(nextNode);
        currentNode.setNextNode(nextNode);
        nodeCount++;
    }

    //big O notation is O(n)
    public X removeAt(int position) {
        if(size() < position) {
            throw new IllegalAccessError("Given position is greater than size.");
        }

        Node currentNode = first;
        Node prevNode = first;

        for(int i = 0; i < position && currentNode.getNextNode() != null; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return nodeItem;
    }

    //Big-O notation is O(n)
    public X get(int position) {
        if(size() < position) {
            throw new IllegalAccessError("Given position is greater than size.");
        }
        Node currentNode = first;
        for(int i = 1; i < size() && currentNode.getNextNode() != null; i++) {
            if(i == position) {
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    //Big-O notation is O(n)
    public int find(X item) {
        if(first == null) {
            throw new IllegalAccessError("Nothing to find.");
        }
        Node currentNode = first;
        for(int i = 1; i < size() && currentNode.getNextNode() != null; i++) {
            if(item.equals(currentNode)) {
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    //Big-O notation is O(1)
    public X remove() {
        if(first == null) {
            throw new IllegalAccessError("Nothing to remove.");
        }
        X nodeItem = first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return nodeItem;
    }

    private class Node {

        private Node nextNode;

        private X nodeItem;

        public Node(X item) {
            this.nextNode = null;
            this.nodeItem = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return this.nodeItem;
        }
    }
}

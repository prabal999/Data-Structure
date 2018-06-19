package com.ph.ds;

public class BasicBinaryTree<X extends Comparable<X>> {

    private Node root;

    private int size;

    public BasicBinaryTree() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public void add(X item) {
        Node node = new Node(item);
        if(root == null) {
            this.root = node;
            this.size++;
        } else {
            insert(this.root, node);
        }
    }

    public boolean contains(X item) {
        Node node = getNode(item);
        return null != node;
    }

    private Node getNode(X item) {
        Node currentNode = this.root;

        while (null != currentNode) {
            int val = item.compareTo(currentNode.getItem());
            if(val == 0) {
                return currentNode;
            } else if(val < 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode.getRight();
            }
        }
        return null;
    }

    private void insert(Node parent, Node child) {
        if(child.getItem().compareTo(parent.getItem()) < 0) {
            if(parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if(child.getItem().compareTo(parent.getItem()) > 0) {
            if(parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        } else {
            // if both are equal then it is upto us to change the data or throw the exception or add duplicate
            // but binary tree is for unique data set.
        }
    }

    private class Node {

        private Node right;

        private Node left;

        private Node parent;

        private X item;

        public Node(X item) {
            this.right = null;
            this.left = null;
            this.parent = null;
            this.item = item;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }
}

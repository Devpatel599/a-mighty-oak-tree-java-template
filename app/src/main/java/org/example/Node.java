package org.example;

public class Node {
    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node left() {
        return this.left;
    }

    public Node right() {
        return this.right;
    }

    public Squirrel getSquirrel() {
        return this.data;
    }
}

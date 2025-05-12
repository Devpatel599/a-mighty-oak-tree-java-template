package org.example;

public class App {
    public static void main(String[] args) {
        // Create Squirrel objects
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        // Create tree nodes
        Node root = new Node(cheeks);
        Node leftChild = new Node(squeaks);
        Node rightChild = new Node(fluffybutt);

        // Connect the nodes
        root.setLeft(leftChild);
        root.setRight(rightChild);

        // Traverse and print
        System.out.println("Root: " + root.getSquirrel().getName());
        System.out.println("Left child: " + root.left().getSquirrel().getName());
        System.out.println("Right child: " + root.right().getSquirrel().getName());
    }
}

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testBinaryTreeConnections() {
        // Create Squirrel objects
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        // Create Nodes
        Node root = new Node(cheeks);
        Node leftChild = new Node(squeaks);
        Node rightChild = new Node(fluffybutt);

        // Connect
        root.setLeft(leftChild);
        root.setRight(rightChild);

        // Assertions
        assertEquals("Cheeks", root.getSquirrel().getName());
        assertEquals("Squeaks", root.left().getSquirrel().getName());
        assertEquals("Mr. Fluffy Butt", root.right().getSquirrel().getName());
    }
}

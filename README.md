# Sorting
Binary Tree Implementation in Java
This project contains a comprehensive implementation of binary trees in Java, including a binary search tree for sorting elements. The implementation provides a hierarchical data structure with a root node and subtrees of children following a parent-child relationship.
Project Structure
Core Interfaces

Tree<E>: Base interface for tree structures
BinaryTree<E>: Interface for binary trees, extending Tree
Position<E>: Interface representing positions within a tree
BTPosition<E>: Extended position interface for binary tree nodes

Implementation Classes

LinkedBinaryTree<E>: Concrete implementation of BinaryTree
BinarySearchTree<E>: Binary search tree implementation for sorting elements
BTNode<E>: Node implementation for binary trees

Exception Classes

EmptyTreeException: Thrown when operations are performed on an empty tree
NonEmptyTreeException: Thrown when trying to initialize a non-empty tree
InvalidPositionException: Thrown when an invalid position is used
BoundaryViolationException: Thrown when attempting to access boundary positions

Key Features

Generic implementation supporting any Comparable type
Tree traversal methods (inorder, etc.)
Node manipulation (insertion, removal)
Tree properties (height, depth, size)
Binary search tree for efficient element sorting

Usage Examples
Creating a Binary Search Tree and Sorting Elements
java// Create a new binary search tree
BinarySearchTree<Integer> bst = new BinarySearchTree<>();

// Insert elements
bst.insert(50);
bst.insert(30);
bst.insert(70);
bst.insert(20);
bst.insert(40);

// Get sorted elements using inorder traversal
for (Integer num : bst.inOrder()) {
    System.out.print(num + " ");
}
// Output: 20 30 40 50 70
Creating a Generic Binary Tree
javaLinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

// Add root and children
Position<String> root = tree.addRoot("Root");
Position<String> left = tree.insertLeft(root, "Left Child");
Position<String> right = tree.insertRight(root, "Right Child");

// Add more nodes
tree.insertLeft(left, "Left Grandchild");
tree.insertRight(left, "Right Grandchild");

// Tree traversal
for (String value : tree.iterator()) {
    System.out.println(value);
}
Main Programs
The project includes two main programs:

Main.java: Demonstrates the BinarySearchTree by generating 100 random integers, inserting them into a BST, and displaying them in sorted order.
LinkedBinaryTree.main(): Demonstrates the LinkedBinaryTree by creating a tree with random values, then displaying various properties like height, depth, and all elements.

Running the Project

Compile all Java files:
javac *.java

Run the BinarySearchTree demo:
java Main

Run the LinkedBinaryTree demo:
java LinkedBinaryTree


Implementation Details
The binary tree implementation follows a node-based approach where each node can have up to two children (left and right). The LinkedBinaryTree provides the core tree functionality, while the BinarySearchTree adds sorting capabilities by ensuring elements are inserted according to their natural ordering.
Key methods include:

insert(): Adds elements to the appropriate position in the tree
inOrder(): Returns elements in sorted order (for BST)
height1()/height2(): Different implementations to calculate tree height
depth(): Calculates the depth of a node in the tree
positions(): Returns all positions in the tree
iterator(): Returns all elements in the tree

The implementation handles edge cases through custom exceptions and provides comprehensive tree traversal capabilities.

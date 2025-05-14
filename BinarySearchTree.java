import java.util.ArrayList;

public class BinarySearchTree<E extends Comparable<E>> extends LinkedBinaryTree<E> {
  
    // Insert an element into the Binary Search Tree
    public void insert(E element) throws EmptyTreeException, InvalidPositionException, BoundaryViolationException {
        if (isEmpty()) {
            try {
                addRoot(element);
            } catch (NonEmptyTreeException e) {
                e.printStackTrace();
            }
        } else {
            insertRecursively(root(), element);
        }
    }

    // Helper method to recursively insert elements
    private void insertRecursively(Position<E> node, E element) throws InvalidPositionException, BoundaryViolationException {
        if (element.compareTo(node.element()) < 0) {
            if (hasLeft(node)) {
                insertRecursively(left(node), element);
            } else {
                try {
                    insertLeft(node, element);
                } catch (InvalidPositionException e) {
                    e.printStackTrace();
                }
            }
        } else {
            if (hasRight(node)) {
                insertRecursively(right(node), element);
            } else {
                try {
                    insertRight(node, element);
                } catch (InvalidPositionException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Perform an in-order traversal to sort the elements
    public Iterable<E> inOrder() throws InvalidPositionException, EmptyTreeException, BoundaryViolationException {
        ArrayList<E> sortedElements = new ArrayList<>();
        for (Position<E> pos : positions()) {
            sortedElements.add(pos.element());
        }
        return sortedElements;
    }
}

public interface BinaryTree<E> extends Tree<E> {
    /** Returns the left child of a node. */
    public Position<E> left(Position<E> v) throws InvalidPositionException, BoundaryViolationException;
    
    /** Returns the right child of a node. */
    public Position<E> right(Position<E> v) throws InvalidPositionException, BoundaryViolationException;
    
    /** Returns whether a node has a left child. */
    public boolean hasLeft(Position<E> v) throws InvalidPositionException;
    
    /** Returns whether a node has a right child. */
    public boolean hasRight(Position<E> v) throws InvalidPositionException;
}

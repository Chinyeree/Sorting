public interface Position<E> {
    E getElement() throws IllegalStateException;

    E element();
}

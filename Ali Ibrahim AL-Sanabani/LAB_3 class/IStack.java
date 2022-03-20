package Lab3;

public interface IStack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}

package Lab4;


public interface IQueue<E> {
    boolean isEmpty();
    int size();
    void enQueue(E element);
    E deQueue();
    E first();

}


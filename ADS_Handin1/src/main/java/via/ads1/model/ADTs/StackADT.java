package via.ads1.model.ADTs;

public interface StackADT<T> {
    T pop();
    T peek();
    void push(T element);
    boolean isEmpty();
}

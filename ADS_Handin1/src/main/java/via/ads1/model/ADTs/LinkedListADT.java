package via.ads1.model.ADTs;

public interface LinkedListADT<T> {

    boolean isEmpty();
    int size();
    void addToHead(T value);
    T removeFromHead();
    T head();
}

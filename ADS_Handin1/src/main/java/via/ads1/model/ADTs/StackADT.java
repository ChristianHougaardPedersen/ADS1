package via.ads1.model.ADTs;

import via.ads1.model.Token;

public interface StackADT<T> {
    T pop();
    T peek();
    void push(T element);
    boolean isEmpty();
}

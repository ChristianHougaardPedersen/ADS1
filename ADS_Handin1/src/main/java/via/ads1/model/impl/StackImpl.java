package via.ads1.model.impl;

import via.ads1.model.ADTs.StackADT;

public class StackImpl<T> implements StackADT<T> {
    private final LinkedListImpl<T> stack;

    public StackImpl() {
        stack = new LinkedListImpl<>();
    }

    @Override
    public T pop() {
        return stack.removeFromHead();
    }

    @Override
    public T peek() {
        return stack.head();
    }

    @Override
    public void push(T element) {
        stack.addToHead(element);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

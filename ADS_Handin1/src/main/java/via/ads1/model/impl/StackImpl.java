package via.ads1.model.impl;

import via.ads1.model.ADTs.StackADT;
import via.ads1.model.Operand;

public class StackImpl<T> implements StackADT<T> {
    private final LinkedListImpl<T> stack;

    public StackImpl() {
        stack = new LinkedListImpl<T>();
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

        Operand op = (Operand) element;
        System.out.println("NEW HEAD: " + op.getValue());
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

package exercise6_stack;

import java.util.ArrayList;

public class ArrayListAsStack<T> {

    private ArrayList<T> stack;

    public ArrayListAsStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return stack.get(stack.size()-1);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return stack.remove(stack.size()-1);
    }

    public void push(T obj) {
        stack.add(obj);
    }
}

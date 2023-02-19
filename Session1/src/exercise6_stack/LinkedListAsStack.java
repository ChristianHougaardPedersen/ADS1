package exercise6_stack;

import exercise5_linkedlist.ADSLinkedList;
import exercise5_linkedlist.Node;

import java.util.ArrayList;

public class LinkedListAsStack<T> {

    private ADSLinkedList<T> stack;
    private Node<T> top;


    public LinkedListAsStack() {
        stack = new ADSLinkedList<>();
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return null;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return stack.remove(stack.size()-1);
    }

    public void push(T elm) {
        Node<T> temp = new Node<>(elm, top);
        top = temp;
    }

    //TODO


}

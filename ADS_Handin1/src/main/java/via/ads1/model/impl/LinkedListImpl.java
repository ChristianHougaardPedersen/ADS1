package via.ads1.model.impl;

import via.ads1.model.ADTs.LinkedListADT;
import via.ads1.model.Node;

public class LinkedListImpl<T> implements LinkedListADT<T> {

    private Node<T> head;
    private int size;

    public LinkedListImpl() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToHead(T value) {
        if (value == null) {
            throw new NullPointerException("value is null");
        }
        Node<T> newNode = new Node<>(value, null);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    @Override
    public T removeFromHead() {
        Node<T> toRemove = head;
        head = head.getNext();
        return toRemove.getElm();
    }

    @Override
    public T head() {
        return head.getElm();
    }
}

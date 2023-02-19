package exercise5_linkedlist;

public class ADSLinkedList<T> implements ADSListADT<T> {

    private Node<T> first;
    private int size;

    public ADSLinkedList() {
        first = null;
        size = 0;
    }

    @Override
    public void add(T elm) {
        if (elm == null) {
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if (size == 0) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        size++;
    }

    @Override
    public void insert(int index, T elm) {
        if (index < 0) {
            return;
        }
        if (index > size) {
            add(elm);
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if (size == 0) {
            first = newNode;
        } else {
            Node<T> cur = first;
            int i = 0;
            while (i < index - 1) {
                cur = cur.getNext();
                i++;
            }
            newNode.setNext(cur.getNext());
            cur.setNext(newNode);
        }
        size++;

    }

    @Override
    public boolean remove(T elm) {

        Node<T> current = first;
        Node<T> previous = null;

        /*
          If element passed as argument is null, or if size is 0,
          return false as argument is invalid.
         */
        if (elm == null || size == 0) {
            return false;
        }

        /*
        If the current node is not null and current element equals
        parameter -> set new first element to be next in list,
         and decrement size + return true
         */
        if (current != null && current.getElm().equals(elm)) {
            first = current.getNext();
            size--;
            return true;
        }

        /*
        Loop through linked list for as long as current node is not null (end of list)
        and current element is not equal to parameter.
         */
        while (current != null && !current.getElm().equals(elm)) {
            previous = current;
            current = current.getNext();
        }

        /*
        If current node is not null and current elm equals parameter
        set previous next to current next and decrease size. + return true
         */
        if (current != null && current.getElm().equals(elm)) {
            assert previous != null;
            previous.setNext(current.getNext());
            size--;
            return true;
        }
        // if this is reached, element is not found.
        return false;
    }

    @Override
    public int indexOf(T elm) {
        Node<T> current = first;
        int counter = 0;

        /*
        If first (current) is not null and current element equals param
        return counter (index)
         */
        if (current != null && current.getElm().equals(elm)) {
            return counter;
        }

        /*
        Loop through list for as long as current != null (end of list)
        AND element != parameter (when element == param -> elm is found)
         */
        while (current != null && !current.getElm().equals(elm)) {
            counter++;
            current = current.getNext();
        }

        /*
        If current elm equals param -> return counter
         */
        if ( current != null && current.getElm().equals(elm)) {
            return counter;
        }
        /*
        elm is not found
         */
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T elm) {

        Node<T> current = first;

        /*
        If first (current) is not null and current element equals param
        return true
         */
        if (current != null && current.getElm().equals(elm)) {
            return true;
        }

        /*
        Loop through list for as long as current != null (end of list)
        AND element != parameter (when element == param -> elm is found)
         */
        while (current != null && !current.getElm().equals(elm)) {
            current = current.getNext();
        }

        /*
        If current elm equals param -> return counter
         */
        if ( current != null && current.getElm().equals(elm)) {
            return true;
        }
        /*
        elm is not found
         */
        return false;
    }

    @Override
    public T remove(int index) {

        Node<T> current = first;
        Node<T> previous = null;
        int currentIndex = 0;

        /*
        If index param is 0, delete first, and set new first to be next.
         */
        if (index == 0 && current != null) {
            first = current.getNext();
            return current.getElm();
        }

        /*
        Loop though list as long as current is not null (list end)
         */
        while (current != null) {

            /*
            If currentIndex == index, node to be deleted is found
            link prev to next and return current (deleted)
             */
            if (currentIndex == index) {
                previous.setNext(current.getNext());
                return current.getElm();
            }
            /*
            Else loop further, incrementing currentIndex each time
             */
            else {
                previous = current;
                current = current.getNext();
                currentIndex++;
            }
        }

        /*
        Index not in list
         */
        return null;
    }

    @Override
    public T set(int index, T elm) {

        Node<T> current = first;
        T oldElm = null;
        int currentIndex = 0;

        if (current != null && index == 0) {
            oldElm = current.getElm();
            current.setElm(elm);
            return oldElm;
        }

        /*
        Loop through list for as long as current is not null
         */
        while (current != null) {

            /*
           If current index equals param -> store current elm as oldElm
           set current elm to param
           return old elm
             */
            if (currentIndex == index) {
                oldElm = current.getElm();
                current.setElm(elm);
                return oldElm;
            }
            /*
            set current to next and increment currentIndex
             */
            else {
                current = current.getNext();
                currentIndex++;
            }
        }

        /*
        Index not in list
         */
        return null;
    }
}

package exercise5_linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        ADSLinkedList<Integer> ll = initList();


        // Remove
        System.out.println("Testing Remove");
        System.out.println("\tFalse: " + ll.remove(Integer.valueOf(11)));
        System.out.println("\tFalse: " + ll.remove(Integer.valueOf(0)));
        System.out.println("\tTrue: " + ll.remove(Integer.valueOf(1)));
        System.out.println("\tTrue: " + ll.remove(Integer.valueOf(5)));

        // Index Of
        System.out.println("\nTesting index");
        ll = initList();
        System.out.println("\t-1: " + ll.indexOf(11));
        System.out.println("\t-1: " + ll.indexOf(0));
        System.out.println("\t0: " + ll.indexOf(1));
        System.out.println("\t4: " + ll.indexOf(5));

        // Contains
        System.out.println("\n Testing contains");
        ll = initList();
        System.out.println("\tFalse: " + ll.contains(11));
        System.out.println("\tFalse: " + ll.contains(0));
        System.out.println("\tTrue: " + ll.contains(1));
        System.out.println("\tTrue: " + ll.contains(5));

        // Remove by index
        System.out.println("\nTesting Remove by index");
        ll = initList();
        System.out.println("\tNull: " + ll.remove(11));
        ll = initList();
        System.out.println("\t1: " + ll.remove(0));
        ll = initList();
        System.out.println("\t2: " + ll.remove(1));
        ll = initList();
        System.out.println("\t6: " + ll.remove(5));

        // Index Of
        System.out.println("\nTesting set");
        ll = initList();
        System.out.println("\t1: " + ll.set(0, 99));
        System.out.println("\t0: " + ll.indexOf(99));
        System.out.println("\t10: " + ll.set(9, 98));
        System.out.println("\t9: " + ll.indexOf(98));
        System.out.println("\tNull: " + ll.set(10, 123));
        System.out.println("\t-1: " + ll.indexOf(123));


    }


    public static ADSLinkedList<Integer> initList() {
        ADSLinkedList<Integer> ll = new ADSLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            ll.add(i);
        }
        return ll;
    }
}

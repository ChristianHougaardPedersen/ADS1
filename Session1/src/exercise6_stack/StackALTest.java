package exercise6_stack;

public class StackALTest {
    public static void main(String[] args) {
        ArrayListAsStack<String> stack = new ArrayListAsStack<>();

        // Is Empty test
        System.out.println("\tTrue: " + stack.isEmpty());

        stack.push("Hello");
        System.out.println("\tFalse: " + stack.isEmpty());
        System.out.println("\tHello: " + stack.peek());
        System.out.println("\tFalse: " + stack.isEmpty());
        System.out.println("\tHello: " + stack.pop());
        System.out.println("\tTrue: " + stack.isEmpty());

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        System.out.println("\t6: " + stack.peek());
        System.out.println("\t6: " + stack.pop());
        System.out.println("\t5: " + stack.pop());
        System.out.println("\t4: " + stack.pop());
        System.out.println("\t3: " + stack.pop());
        System.out.println("\t2: " + stack.pop());
        System.out.println("\t1: " + stack.pop());
        System.out.println("\tnull: " + stack.pop());






    }
}

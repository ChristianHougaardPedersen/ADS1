package exercise7_ParanthesisChecker;

import java.util.Stack;

public class ParenthesisChecker {

    private static Stack<Character> p = new Stack<>();

    public static boolean checkString(String string) {

        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case '{', '[', '(' -> p.push(string.charAt(i));
                case '}' -> {
                    if (p.peek().equals('{')) {
                        p.pop();
                    } else return false;
                }
                case ']' -> {
                    if (p.peek().equals('[')) {
                        p.pop();
                    } else return false;
                }
                case ')' -> {
                    if (p.peek().equals('(')) {
                        p.pop();
                    } else return false;
                }
            }
        }

        return p.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("True: " + ParenthesisChecker.checkString("{[(asdsad)]}"));
        System.out.println("True: " + ParenthesisChecker.checkString("as{as[(asdsad)sd]q}"));
        System.out.println("False: " + ParenthesisChecker.checkString("{[((asdasd)]}"));
    }

}



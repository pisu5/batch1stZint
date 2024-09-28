import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // Stack2.addElementInStack(stack);
        // String s = "Vampire Diaries";
        // Stack2.reverseStringWithStack(s);
        String str1 = "(a+b+((a-b)))";
        String str2 = "(a+b+(a-b))";
        boolean t = Stack2.checkRedunnt(str1);
        System.out.println(t);

    }

    public static void addElementInStack(Stack<Integer> stack) {
        stack = new Stack<>();
        // we use push to add an element in stak
        stack.push(55);
        stack.push(555);
        stack.push(5555);
        stack.push(55555);
        // check if stack is emeplty

        System.out.println(stack.isEmpty());
        // remove top elelennt pop
        stack.pop();
        System.out.println("This is our peak elelmnt" + " " + stack.peek());

    }

    public static void reverseStringWithStack(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ch.push(c);
        }
        while (!ch.isEmpty()) {

            ans.append(ch.pop());
        }
        System.out.println(ans);

    }

    // valid parenthsis
    public boolean isValid(String s) {
        Stack<Character> sb = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                sb.push(c);

            } else if (c == ')' && sb.size() > 0 && sb.peek() == '(') {
                sb.pop();
            } else if (c == '}' && sb.size() > 0 && sb.peek() == '{') {
                sb.pop();
            } else if (c == ']' && sb.size() > 0 && sb.peek() == '[') {
                sb.pop();
            } else {
                return false;
            }
        }
        if (sb.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkRedunnt(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')' && st.peek() == '(') {
                return false;
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            } else {
                st.push(ch);
            }
        }

        return true;
    }
}

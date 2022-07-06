import java.util.Stack;

public class A_9093 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        String str = "I am happy today";

        int rn = str.length();

        int i = 0;

        while (rn-- > 0) {
            if( str.charAt(i) == ' ' ) {
                while (!st.empty()) {
                    System.out.print(st.pop());
                }
            } else {
                st.push(str.charAt(i));
            }
            i++;
        }



    }
}

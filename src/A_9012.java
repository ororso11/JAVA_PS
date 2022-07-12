import java.util.Stack;

public class A_9012 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        String str = "(()())((()))";

        for(char c : str.toCharArray() ) {
            if( c == '(' ) {
                st.push(c);
            } else {
                if( st.empty() ) {
                    st.push(c);
                    break;
                } else {
                    st.pop();
                }
            }
        }

        if(st.empty()) System.out.println("YES");
        if(!st.empty()) System.out.println("NO");

    }
}

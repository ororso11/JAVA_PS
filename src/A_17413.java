import java.util.Stack;

public class A_17413 {

    static void print(Stack<Character> s)  {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void main(String[] args) {

        String str = "<baekjoon> online <judge>";

        Stack<Character> s = new Stack<>();
        boolean is = false;

        for(char c : str.toCharArray()) {
            if( c == '<' ) {
                is = true;
                System.out.print(c);
            } else if(c == '>') {
                is = false;
                System.out.print(c);
            } else if(is){
                System.out.print(c);
            } else {
                if( c == ' ') {
                    System.out.print(c);
                    print(s);
                } else {
                    s.push(c);
                }
            }
        }

        print(s);

    }
}

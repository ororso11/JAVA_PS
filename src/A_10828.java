import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class A_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> sta = new Stack<>();

        int n = 14;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        if( s.equals("push") ) {
            sta.push(Integer.parseInt(st.nextToken()));
        }

        System.out.println(sta.pop());


    }
}

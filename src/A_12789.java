import java.util.ArrayList;
import java.util.Scanner;

public class A_12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;

        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                list.add(i + 1);
            }
        }

        for(int i=a-1; i<=b-1; i++) {
            System.out.println(i);
            sum += list.get(i);
        }

    }
}

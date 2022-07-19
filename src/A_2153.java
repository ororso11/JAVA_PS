import java.util.HashMap;
import java.util.Scanner;

public class A_2153 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;

        if( str.indexOf('a') != -1 ) {
            System.out.println("소수");
            return;
        }

        // 대문자,소문자
        for (int i = 0; i < str.length(); i++) {
            if( Character.isUpperCase(str.charAt(i)) ) {
                sum += ((int)str.charAt(i)-38);
            } else if(Character.isLowerCase(str.charAt(i))) {
                sum += ((int)str.charAt(i)-96);
            }
        }

        boolean isPrime = false;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                isPrime = true;
                break;
            }
        }

    }
}

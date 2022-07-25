import java.util.Scanner;

public class A_1568 {
    public static void main(String[] args) {

        // N 마리의 새 : 자연수를 배우기원한다.
        // 새 : 1 ~ N - 오름차순
        // K = 3 , 새가 K수만큼 빠진다.
        // 현재 나무에 앉아있는 새의수가 지금 불러야 하는 수보다 작을때는 1부터 게임을 다시시작한다.
        // 나무 : N , 하나의 수?? 1초 = 1마리, 2초 = 2마리
        // 총 몇초가 걸리는지 출력한다.

        // 8 - 4 = 4
        // 4 - 1 = 3;
        // 3 - 2 = 1;

        // 4 - 1 = 3;
        // 3 - 2 = 1;


        // 10

        // 3 -> 1 = 2
        // 2 -> 2 = 0;

        // 4 - 1 = 3;
        // 3 - 2 = 1;
        // 1 - 3 = 0; - 제외

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int c = 0;
        int i = 1;

        while ( num >= 1 ) {

            if( num < i) {
                i = 1;
            }
            num -= i;
            c++;
            i++;

        }
        System.out.println(c);
    }
}

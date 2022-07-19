public class A_ {
    public static void main(String[] args) {
        int[] prime = new int[100];
        int pn = 0;
        boolean[] check = new boolean[101]; // 지워질경우 true
        int n = 100;

        for(int i = 2; i <= n; i++) {
            if(check[i] == false) {
                prime[pn++] = i;
                for(int j = i * i; j <=n; j+=i) {
                    check[j] = true;
                }
            }
        }

    }
}

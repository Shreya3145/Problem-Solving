public class Problem03 {
    public static void main(String[] args) {
        final long n = 600851475143l;
        factor(n);
    }
    public static void factor(long n) {
        long i = 2;
        long ans = 0;
        while (i <= n) {
            if (n % i == 0) {
                ans = i;
                n = n / i;
            } else {
                i++;
            }
        }
      System.out.println(ans);
    }
}

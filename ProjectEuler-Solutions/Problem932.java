public class Problem932 {
    public static void main(String[] args) {
        int n = 2025;
        int m = 5131;
        int o = 3025;
        int p = 81;
        
        numberSplitter(n);
        defineTOfN(n);
    }

    public static int numberSplitter(int n){
        int ans = 0;
        int digits = (int) Math.log10(n) + 1;
        int div = (int) Math.pow(10, digits / 2); 

        while(n > 0){
        int last_half = n % div;
        int first_half = n / div;
        ans = numberChecker(first_half, last_half);
        break;
        } 

        System.out.println(ans);
        return 0;
    }

    public static int numberChecker(int f, int l) {
        int tot = f+l;
        int square = tot*tot;
        return square;
    }
    public static int defineTOfN(int n){
        int m = 16;
        for(int i=0; i<m; i++){
            
        }
        return n;
    }
    
}

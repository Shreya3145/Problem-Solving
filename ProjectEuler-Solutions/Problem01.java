public class Problem01 {
    public static void main(String args[]) {
        int n = 100;
        int[] k = new int[n]; 
        int index = 0; 
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                k[index] = i;   
                s += k[index];
                System.out.println(s); 
                index++; 
            }
        }
    }
}

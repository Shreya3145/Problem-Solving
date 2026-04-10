

public class Problem04 {
    public static void main(String[] args) {
        int digit1;
        int digit2;
        int mul;
        int max = 0;

        for (digit1 = 999; digit1 >= 100; digit1--) { 
            for (digit2 = 999; digit2 >= 100; digit2--) {  

                mul = digit1 * digit2;

                if(checkPalindrome(digit1, digit2, mul) && (mul>max)){
                    max = mul;
                }
            }
        }
        System.out.println(max);

    }

        public static boolean checkPalindrome(int d1, int d2, int mul){
            int original = mul;
            int reversed = 0;

            while (mul > 0) {
                int digit = mul % 10;  
                reversed = reversed * 10 + digit;  
                mul /= 10;  
            }
            return reversed==original;

        }

    }


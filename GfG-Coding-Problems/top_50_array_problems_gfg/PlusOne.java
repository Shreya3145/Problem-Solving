package top_50_array_problems_gfg;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3};
         System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0){
            int[] newArr = new int[digits.length + 1];
            newArr[0] = carry;
            System.arraycopy(digits, 0, newArr, 1, digits.length) ;
            return newArr;
        }
        return digits;
    }
    
}

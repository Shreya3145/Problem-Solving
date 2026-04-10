package top_50_array_problems_gfg;

import java.util.Arrays;

public class ReverseArrayInGroups {
     public static void main(String[] args) {
     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
     int k = 3;

     for(int i = 0; i < arr.length; i += k){
        int left = i;
        int right = Math.min(i + k - 1, arr.length - 1);

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    System.out.println(Arrays.toString(arr));
}
}


    


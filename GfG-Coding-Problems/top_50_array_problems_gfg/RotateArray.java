package top_50_array_problems_gfg;

import java.util.Arrays;

public class RotateArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;

        int n = arr.length;
        if(n == 0) return;
        d %= n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));


    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}
package top_50_array_problems_gfg;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

    
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }


    }
    

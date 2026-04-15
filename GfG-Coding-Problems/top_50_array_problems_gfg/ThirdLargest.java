package top_50_array_problems_gfg;

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }
            else if(max > arr[i] && arr[i] > secondMax){
                thirdMax = secondMax;
                secondMax = arr[i];
            }
            else if(secondMax > arr[i] && arr[i] > thirdMax){
                thirdMax = arr[i];
            }
        }
        System.out.println((thirdMax == -1) ? max : thirdMax);
    }
    
}

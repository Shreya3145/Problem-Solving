package top_50_array_problems_gfg;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        int maxCount = 0, count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        maxCount = Math.max(count, maxCount);
        System.out.println(maxCount);
    }
    
}

package arrays;

public class CountFrequencyOfArrays {
    public static void main(String[] args) {
         int[] arr = {1, 2, 2, 3, 2};
         int target = 2, count = 0;

         for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
         }
         System.out.println(count);
    }
}

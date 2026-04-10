package arrays;
public class maximumArrayElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
    
}

package arrays;
class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        int target = 5;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
    
}
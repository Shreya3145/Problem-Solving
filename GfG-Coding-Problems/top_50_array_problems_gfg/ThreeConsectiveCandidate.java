package top_50_array_problems_gfg;

public class ThreeConsectiveCandidate {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(maxA < arr[i]){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
            else if(maxA > arr[i] && arr[i] > maxB){
                maxC = maxB;
                maxB = arr[i];
            }
            else if(maxB > arr[i] && arr[i] > maxC){
                maxC = arr[i];
            }

            if(minA > arr[i]){
                minB = minA;
                minA = arr[i];
            }
            else if(minA < arr[i] && arr[i] < minB){
                minB = arr[i];
            }
        }
        System.out.println(Math.max(maxA * maxB * maxC, maxA * minA * minB));



    }
    
}

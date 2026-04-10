package arrays;

import java.util.HashMap;

public class MaximumFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 5, 8, 9, 9 ,9, 9};
        int maxValue = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            maxValue = Math.max(maxValue, map.get(num));
        }
        System.out.println(maxValue);
    }
    
}

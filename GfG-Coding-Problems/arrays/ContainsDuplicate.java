package arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;

        for(int num: arr){
            if(set.add(num) == false){
                flag = true;
                break ;
            }
            }
            System.out.println(flag);

        }

    }


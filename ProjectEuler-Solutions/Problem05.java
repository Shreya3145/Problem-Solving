public class Problem05 {
    public static void main(String[] args) {
        int ans = 20;
        while(true){
            boolean flag = true;
            for(int a = 20 ;a >= 1; a--){
                if(ans % a !=0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(ans);
                break;
            }
            ans += 20;
            }  
            
        }
    }

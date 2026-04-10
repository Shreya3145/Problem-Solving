public class Problem02 {
public static void main(String args[]){
    int n1=1, n2=1, n3=0, limit=5000000, sum=0, ans=0;

    while(n3 <= limit){
        n3 = n1 + n2; 
        n1 = n2; 
        n2 = n3;
        if(n3 % 2 == 0){
            sum += n3;
            ans = (sum <= limit) ? sum : limit;
            
        }
    }
    System.out.println(ans);
}
}

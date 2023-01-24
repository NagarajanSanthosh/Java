package AdditionPalindrome;

public class First {
    int rev(int n){
        int re =0;
       while(n!=0){
           int y=n%10;
           re=(re*10)+y;
           n/=10;
       }
        return re;
    }
    void till(int n){
        int sum= n+rev(n);

        for(int i=1;i<=5;i++){
            int r= rev(sum);
            if(r==sum){
                System.out.println(sum);
                break;
            }
            else if(i==5)
                System.out.println(sum);
            else
                sum+=r;
        }
    }
}

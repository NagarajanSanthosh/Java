package StrongNumber;

public class First {
    int factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){ //5-->4-->1//
            fact*=i;     //120-->120+24=144-->144+1=145//
        }
        return  fact;
    }
    void strongNumber(int n){
        int x=n, sum=0;
        while(n!=0){
            int y=n%10;
            sum+=factorial(y);
            n/=10;
        }
        if(x==sum)
            System.out.println(sum + " is strong number");
        else
            System.out.println("Not a strong number");
    }
}

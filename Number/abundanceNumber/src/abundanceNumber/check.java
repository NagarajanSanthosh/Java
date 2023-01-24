package abundanceNumber;

public class check {
    void abu(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;//1+2+3+4+6=16
            }
        }
        if(sum>n)
            System.out.println("Abundance number");
        else
            System.out.println("not an abundance number");
    }
}

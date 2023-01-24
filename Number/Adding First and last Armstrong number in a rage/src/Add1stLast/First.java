package Add1stLast;

public class First {
    int dc(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    int power(int x, int y){
        int p=1;
        for(int i=1;i<=y;i++){
            p*=x;
        }
        return p;
    }
    int arm(int n){
        int k=dc(n);
        int sum=0;
        while(n!=0){
            int y=n%10;
            int h=power(y,k);
            sum+=h;
            n/=10;
        }
        return  sum;
    }
    void fLarm(int x, int y){
        int h=0;
        int k=0;
        for(int i=x;i<=y;i++){
            h=arm(i);
            if(h==i)
                break;
        }
        for(int i=y;i>=x;i--){
            k=arm(i);
            if(k==i)
                break;
        }
        int sum=h+k;
        System.out.println(sum);
    }
}

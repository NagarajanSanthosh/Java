package ArmStrongNumber;

import java.util.Scanner;
class First{
    int dc(int n){
        int count =0;
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
    void arm(int n){
        int k=dc(n);
        int sum=0,x=n;
        while(n!=0){
            int y=n%10;
            int h=power(y, k);
            sum+=h;
            n/=10;
        }
        if(x==sum)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an armstrong number");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        First fi = new First();
        fi.arm(n);
    }
}

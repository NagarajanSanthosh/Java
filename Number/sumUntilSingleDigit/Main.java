package sumUntilSingleDigit;

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
    void sumUSd(int n){
        int k=dc(n);
        while(k!=1){
            int sum=0;
            while(n!=0){
                int y=n%10;
                sum+=y;
                n/=10;
            }
            n=sum;
            k=dc(n);
        }
        System.out.println(n);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        First fi = new First();
        fi.sumUSd(n);
    }
}

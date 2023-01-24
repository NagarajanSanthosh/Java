package primeRange;

import java.util.Scanner;
class First{
    int prime(int n){
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag++;
                break;
            }
        }
        return flag;
    }
    void primeRange(int a, int b){
        System.out.print("the prime numbers are ");
        for(int i=a;i<=b;i++){
            int k=prime(i);
            
            if(k==0){
                System.out.print(i+" ");
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        First fi = new First();
        fi.primeRange(a,b);
    }
   
}

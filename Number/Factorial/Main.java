package Factorial;

import java.util.Scanner;
class First{
    void Fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f*=i;
        }
        System.out.println(f);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        First fi = new First();
        fi.Fact(n);
    }
}

import java.util.*;
class Fibonacci{
    void fibN(int n){
        int n1=0,n2=1,c;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=n;i++){
            c=n1+n2; // 1
            n1=n2;
            n2=c;
            System.out.print(c+" ");
        }
        System.out.println("");
    }
}

 public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Fibonacci fi = new Fibonacci();
        fi.fibN(n);
    }
}
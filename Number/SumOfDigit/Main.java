package SumOfDigit;
import java.util.*;
class First{
    void sumD(int n){
        int sum=0;
        while(n!=0){
            int y=n%10;
            sum+=y;
            n/=10;
        }
        System.out.println(sum);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        First fi = new First();
        fi.sumD(n);
    }
}

package SumOfNaturalNumbers;
import java.util.*;
class First{
    public void sumN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        First fi = new First();
        fi.sumN(n);
    }
   
}

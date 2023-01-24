import java.util.*;
public class starPattern2{
     static void pattern(int n){
         int a=1;
        for(int i=1;i<=a&&a<=n;i++){
           System.out.print("* ");
           if(i==a){
              System.out.println("");
              i=0;
              a++;
           }
           }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        }
    }

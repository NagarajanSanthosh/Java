import java.util.*;
public class xPattern{
     static void pattern(int n){
       int h=n-1;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j){
                   System.out.print("* ");
                   if(j==h){
                       h--;
                   }
               }
               else if(j==h){
                   System.out.print("* ");
                   h--;
               }
               else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
           
       }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        }
    }

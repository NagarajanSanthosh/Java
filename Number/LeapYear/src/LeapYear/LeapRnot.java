package LeapYear;

import java.util.Scanner;

public class LeapRnot {
     static void leap_Not(int n){
        if(((n%4==0)&&(n%100!=0))||(n%400==0)){
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a leap year");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        leap_Not(n);
    }
}

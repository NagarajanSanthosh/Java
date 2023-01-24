import java.util.Scanner;
class First{
     int palindrome(int a){
        int rev=0;
        while(a!=0){
            int y=a%10;
            rev=(rev*10)+y;
            a/=10;
        }
        return rev;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        First fi = new First();
        int ans= fi.palindrome(a);
        if(ans==a)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
import java.util.Scanner;
class First{
    int prime(int n){
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag++;
            }
        }
        return flag;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        First fi = new First();
        int ans =fi.prime(n);
        if(ans==0)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
}
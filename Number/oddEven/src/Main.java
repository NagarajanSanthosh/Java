import java.util.*;
class First{
    int oddEven(int n){
        if(n%2==0)
            return 1;
        else
            return 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        First f1 = new First();
        int ans = f1.oddEven(n);
        if(ans==1)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
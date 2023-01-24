import java.util.*;
class First{
    void posNeg(int n){
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        First fi =new First();
        fi.posNeg(n);

    }
}
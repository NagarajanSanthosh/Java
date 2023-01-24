package This;
import java.util.Scanner;
public class This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        Calc obj = new Calc(n1,n2);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        obj.add(1,2);
        obj.add(2,3,4);
        obj.add(1.1,10.2);
    }
}
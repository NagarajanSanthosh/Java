package BiggestOfThree;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class First{
    void bigT(int a, int b, int c){
            if((a>b)&&(a>c))
            System.out.println("A is greater");
            else if(b>c)
            System.out.println("B is greater");
            else 
            System.out.println("C is greater");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a =sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        First fi =new First();
        fi.bigT(a,b,c);

    }
}

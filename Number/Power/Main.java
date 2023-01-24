package Power;

import java.util.Scanner;
class First{
    int power(int x , int y){
        int p=1;
        for(int i=0;i<y;i++){
            p*=x;
        }
        return p;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        First fi = new First();
        int ans =fi.power(a, b);
        System.out.println(ans);
    }
}

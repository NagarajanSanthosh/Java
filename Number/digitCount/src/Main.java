import java.util.*;
class First{
    void dc(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        First fi = new First();
        fi.dc(n);
    }
}
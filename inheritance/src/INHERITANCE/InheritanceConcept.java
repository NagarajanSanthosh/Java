package INHERITANCE;
import java.util.Scanner;
public class InheritanceConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        calcVadv cV= new calcVadv();
        int result1 = cV.add(n1,n2);
        int result2 = cV.sub(n1,n2);
        int result3 = cV.mul(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

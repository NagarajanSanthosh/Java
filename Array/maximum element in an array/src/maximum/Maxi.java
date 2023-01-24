package maximum;
import java.util.Scanner;
public class Maxi {
    static void display(int max){
        System.out.print(max);
    }
    static int array(int n, int[] a){
        int max = a[0];
        for(int i=1;i<n;i++){
            int k=a[i];
            if(k>max){
                max =k;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans =array(n,a);
        display(ans);
            }
        }
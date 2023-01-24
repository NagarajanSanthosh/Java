package This;
public class Calc {
    int num1, num2;
    public Calc(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i, int j, int k){
        System.out.println(i+j+k);
    }
    public  void add(double i, double j){
        System.out.println(i+j);
    }
}

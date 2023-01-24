package Evenodd;

public class First {
    void eo(int n){//10
        int evSum=0, odSum =0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                evSum+=i;//2+4+6+8+10-->30
            else
                odSum+=i;//1+3+5+7+9-->25
        }
        System.out.println("Even sum ="+evSum+" ");
        System.out.println("Odd sum ="+odSum);
    }
}

package automophic;

class First {
    int dc(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return  count;
    }
    int power(int x, int y){
        int p=1;
        for(int i=1;i<=y;i++){
            p*=x;
        }
        return p;
    }
    void Automorphic(int n){
        int k = dc(n); //3
        int h= power(n,2);
        int g=power(10,k);
        int ans =h%g;
        if(ans==n)
            System.out.println("Automorphic number");
        else
            System.out.println("Non auotomorpnic number");
    }
}


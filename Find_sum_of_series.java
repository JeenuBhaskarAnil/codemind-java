import java.util.*;
import java.lang.*;
class A{
    public static void main(String args[]){
        Scanner x= new Scanner(System.in);
        int n=x.nextInt();
        double s=0;
        while (n>0){
            s=s+(double)1/n;
            n=n-1;
            
        }System.out.format("%.2f",s);
    }
}

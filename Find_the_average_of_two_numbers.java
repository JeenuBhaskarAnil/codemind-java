import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        int a,b,c;
        double  ar=0.0;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=x.nextInt();
    
    
        ar=0.5*(a+b);
        System.out.format("%.4f",ar);
    }
}
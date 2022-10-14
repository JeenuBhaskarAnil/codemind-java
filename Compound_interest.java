import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        double a=x.nextInt();
        double b=x.nextInt();
        double c=x.nextInt();
       double f=Math.pow((1+b*0.01),c);
       f=a*f;
        System.out.format("%.2f",f);
        
    }
}
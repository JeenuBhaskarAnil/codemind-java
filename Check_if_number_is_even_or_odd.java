import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        int a,b,c;
        double s=0.00, ar=0.0;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        if (a%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}
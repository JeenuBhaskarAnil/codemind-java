import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a=x.nextInt();
        double f=1.8*a+32;
        System.out.format("%.2f",f);
        
    }
}
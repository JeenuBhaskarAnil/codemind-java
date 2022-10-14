import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a=x.nextInt();
        double f=(a-32)*(1/1.8);
        System.out.format("%.2f",f);
        
    }
}
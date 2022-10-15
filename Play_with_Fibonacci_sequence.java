import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=1;i<n-1;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
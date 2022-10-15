import java.util.*;
import java.lang.*;
class A{
    public static void main(String args[]){
        Scanner x= new Scanner(System.in);
        int n=x.nextInt();
        double s=Math.sqrt(n);
        if (s==(int)s){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}

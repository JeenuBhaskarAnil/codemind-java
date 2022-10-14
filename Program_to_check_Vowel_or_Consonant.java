import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        char a;
        Scanner x = new Scanner(System.in);
        a= x.next().charAt(0);
        if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.print("Vowel");
        }else{
            System.out.print("Consonant");
        }
    }
}
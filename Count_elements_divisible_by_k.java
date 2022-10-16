import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        
        int s=0;
        int k=x.nextInt();
        
        for (int i=0;i<n;i++){
            int d=x.nextInt();
            
            if (d%k==0){
                s=s+1;
            }
        }System.out.println(s);
    }
}
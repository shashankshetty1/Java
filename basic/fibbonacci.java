
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        System.out.print("enetr the number till range of fibbonaci : ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        fab(a);
        
    }
    public static void fab(int n){

        int c;
        int a=0;
        int b=1;
        System.out.print(a+ ","+ b +",");


        for(int i=0;i<=n;i++){

            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ ",");
        }
    }

    
}

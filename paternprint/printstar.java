import java.util.Scanner;
import java.util.*;

public class printstar{
    public static void main(String[] args) {
        // printorder();
        // printordereverse();
        // patern3();
        printorder4();
    }
        static void printorder(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many to be priented:");
		int n = scan.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        
    }

    static void printordereverse(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter number to be priented");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void patern3(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter number to be priented");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

    }
    for(int i=1;i<=n;i++){
        for(int j=n-1; j>=i;j--){
            System.out.print("*");
        }
        System.out.println();
    }

}
static void printorder4(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter how many to be priented:");
    int n = scan.nextInt();
    for(int i = 1; i<=4; i++)
    {
           for(int j=3;j>=i;j--)
           {
            System.out.print(" ");
           }
           for (int k=1;k<=i;k++)
           {
            System.out.print("*");
           }
            System.out.println();
    }
    
}

}
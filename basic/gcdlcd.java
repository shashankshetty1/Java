 import java.util.Scanner;
 
 public class gcdlcd{
    public static void main(String[] args) {

        System.out.print("enetr a number A : ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("enetr a number B : ");
        int b=sc.nextInt(); 
        System.out.println("the GCD of "+a+" and " +b+"");
        int GCD = gcd(a,b);
        int LCD= (a*b)/GCD;
        System.out.println("GCD="+ gcd(a, b));
        System.out.println("LCD="+ LCD);
       }
       static int gcd(int a,int b){

        int temp=0;
        while (b!=0) {
             temp=b;
             b=a%b;
             a=temp;
            
        }
        return a;

       }

 }
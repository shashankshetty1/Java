import java.util.Scanner;

public class factorial{
    public static void main(String[] args){

       
        System.out.print("enter a number to factorial :");
        Scanner sc= new Scanner(System.in);
        int fact= sc.nextInt();
        int a= factorialrecurssion(fact);
        System.out.println("factorial 0f number is " + a);

        int b= factoriall(fact);
        System.out.println("factorial 0f number iss " + b);
    }
    public static int factoriall(int n){
        int result=1;

        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;



    }
    public static int factorialrecurssion(int n){

        if(n==1 || n==0){
            return 1;
        }
        else{

            return  n* factorialrecurssion(n-1);
   
        }

    }
}
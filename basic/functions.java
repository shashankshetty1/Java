 import java.util.Scanner;
 
 public class functions{
    public static void main(String[] args) {

       int ans= sum();
       System.out.println(ans);
        

        
         
         }

       static int  sum(){
              //void
              //string

        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the first number:");
        int num1 = in.nextInt();
        System.out.print("Enter the second number:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;


       }


 }
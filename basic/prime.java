
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number to check");
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
       check(n);
       }
        public static void check(int n){
            int temp=0;
            for(int i=2;i<n-1;i++){
                if(n%i==0){

                    temp=temp+1;  
                }
                  
            }
            if(temp>0){
                System.out.println( n + " is not a prime number");
            }
            else{
                System.out.println("the given " +n+" is prime number");
            }
        }
    }
    


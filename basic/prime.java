
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter a number to check");
        Scanner in =new Scanner(System.in);
        n=in.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2)
            System.out.println("the given number " +n+ " is prime number" );
            else
            System.out.println("the given number " +n+ " is not prime");


        }
    }
    


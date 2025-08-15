import java.util.Scanner;

public class powerofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int B = sc.nextInt();
        System.out.print("Enter exponent: ");
        int p = sc.nextInt();
        
        int sum=1;

        for(int i=1;i<=p;i++){
            
            sum=sum*B;
           
        }
         System.out.println("The vale of " +B+ " power " +p+ " is "+sum);

    }
    
}

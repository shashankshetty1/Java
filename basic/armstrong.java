import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        System.out.print("enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int len=0;

        while( temp!=0){
            
            temp=temp/10;
            len++;
           
        }
        System.out.println("The length of the given number "+len);
        
        int val=n;
        int rem=0;
        int arm=0;
        
        while(val!=0){

            rem=val%10;
            int mul=1;
             for(int i=1;i<=len;i++){
            
                mul= mul * rem;
                }
                arm= arm+mul;
                val=val/10;
                System.out.println(arm);
        }
        if (arm == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }      
        }   
}

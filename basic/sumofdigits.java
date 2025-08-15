import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = in.nextInt();
        int a= sum(number);
        System.out.println("the sum of digits are : "+a);  

        System.out.print("enter a number to check strong number : ");
        int strong = in.nextInt();
        int b= strongnumber(strong);
        System.out.println("the given number !sum is : "+b); 
        
        if(strong==b){
            System.out.println("Strong number");
        }else{
            System.out.println("not strong number");
        }
        
    }
    public static int sum(int no){

        int rem=0;
        int sum=0;

        while(no!=0){
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        return sum;
    }
    public static int strongnumber(int no){
        int rem=0;
        int total=0;

        while (no!=0) {
            rem=no%10;
            total=total+fact(rem); 
            no=no/10;       
        }
        return total;
        
    
    }
    public static int fact(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
}

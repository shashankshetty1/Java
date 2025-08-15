import java.util.Scanner;

public class Noofdigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = in.nextInt();
        int a=digitcount(number); 
        System.out.println("The number of digints in a number is > "+a);  
    }
     public static int digitcount(int no){
        int count =0;
            
            if(no==0)
            return 1;
                else{
                    while(no!=0){

                        no=no/10;
                        count= count +1;
                        
                    }
                    return count;
            }
            
        }

        
}

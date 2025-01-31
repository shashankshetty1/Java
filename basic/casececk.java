import java.util.Scanner;

public class casececk{
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
        char ch =in.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");

        }
        else{
            System.out.println("uppercase");
        }


        


    }

     
}
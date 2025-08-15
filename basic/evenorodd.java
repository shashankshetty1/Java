import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        function(num);
        
    }
    public static void function(int n){
        if(n%2==0){
            System.out.println(+n+"44 :is a even number");
        }
        else{
            System.out.println(+n+": not a even number");
        }
    }
}

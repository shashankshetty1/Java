import java.util.*;

public class swap {
    public static void main(String[] args) {
        System.out.println("enetr a number A :");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enetr a number B :");
        int b=sc.nextInt();
        swapp(a,b);


    }
    public static void swapp(int a,int b){

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a and b are" +a +" " +b);

    }
    
}

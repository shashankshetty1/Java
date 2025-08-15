import java.util.Scanner;

public class largeno {
    public static void main(String[] args) {
        System.out.print("enetr a number A :");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("enetr a number B :");
        int b=sc.nextInt(); 
        System.out.print("enetr a number C :");
        int c=sc.nextInt();   
        large(a,b,c);      
    }
    public static void large(int a,int b,int c){

        if(a>b && a>c){
            System.out.println(a +" :IS greater");
        }else if(b>a && b>c){
            System.out.println(b+ " :is grater");
        }else{
            System.out.println(c+" :Is greter");
        }


    }
}

import java.util.Scanner;

public class multitable {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = in.nextInt();

        for(int i=1;i<=10;i++){
            int no=number;
            no=no*i;
            System.out.println(number+" * "+i+" = " +no  );

        }
      }
    
}

import java.util.Scanner;

public class printingstarpattern {
    public static void main(String[] args) {
        // box();
        // trianglestright(5);
        ultatrianglestright(5);
        
    }
      static void box(){
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter zixe of box to print");
         int n = scan.nextInt();

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print("* ");
         }
         System.out.println("");
        }   
}
     static void trianglestright(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
            System.out.print("* ");
         }
         System.out.println("");
        }  


     }
      static void ultatrianglestright(int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<n;j++){
            System.out.print("* ");
         }
         System.out.println("");
        }  


     }
}
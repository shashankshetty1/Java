import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        String binary=Integer.toBinaryString(a);
        System.out.println("The integers" +a+" Binary vale is "+binary);

        sc.nextLine();

        System.out.print("Enter a number in binary :");
        String binaryy = sc.nextLine();
        int decimal = Integer.parseInt(binaryy, 2);
        System.out.println("Decimal: " + decimal);

    }
    
}

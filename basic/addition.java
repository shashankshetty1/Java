import java.util.Scanner;

public class addition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Only one Scanner declaration needed
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}

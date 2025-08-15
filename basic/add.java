import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.print("Enter a number 1: ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        System.out.print("Enter a number 2: ");
        int x = sc.nextInt();

        add s = new add();

        System.out.print("Method is called. ");
        s.addition(z, x); // Just call the method separately
    }

    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("When 2 numbers are added: " + sum);
    }
}

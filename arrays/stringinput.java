import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume leftover newline

        String[] arr = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("You entered:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}

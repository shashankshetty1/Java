import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter employee id");
        int empno = in.nextInt();
        String department = in.next();

        switch (empno) {
            case 1:
                System.out.println("Hare Krishna");
                break;
            case 2:
                System.out.println("Hare Ram");
                break;
            case 3:
                switch (department) {
                    case "it":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct employee ID");
                break;
        }

        
    }
}

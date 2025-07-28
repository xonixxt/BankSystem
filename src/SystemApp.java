import java.util.Scanner;

public class SystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== Bank System ===");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View account");
            System.out.println("6. List all accounts");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            break;
        }

        sc.close();
    }
}

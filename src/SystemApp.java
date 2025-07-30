import java.util.Scanner;

public class SystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        while (running) {
            System.out.println("\n=== BANK SYSTEM ===");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. View Account");
            System.out.println("7. List All Accounts");
            System.out.println("8. Logout");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter owner name: ");
                    String owner = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    bank.addAcc(new Account(owner, password));
                    break;

                case 2:
                    System.out.print("Enter account ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter password: ");
                    String passwordWritten = sc.nextLine();
                    bank.login(id, passwordWritten);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    bank.deposit(amount);
                    break;

                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double amountWithdraw = sc.nextDouble();
                    bank.withdraw(amountWithdraw);
                    break;

                case 5:
                    System.out.print("Enter destination account ID: ");
                    int destinationId = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double amountTransfer = sc.nextDouble();
                    bank.transfer(destinationId, amountTransfer);
                    break;

                case 6:
                    bank.viewAccount();
                    break;

                case 7:
                    bank.listAccs();
                    break;

                case 8:
                    bank.logout();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}

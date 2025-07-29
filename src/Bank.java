import java.util.*;

public class Bank {
    private Account loggedAcc;
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAcc(Account acc){
        accounts.add(acc);
        System.out.println("Account added successfully.");
    }
    public void listAccs(){
        if (accounts.isEmpty()) {
            System.out.println("No accounts registered.");
            return;
        }
        for (Account acc : accounts){
            System.out.println("Owner: " + acc.getOwner());
            System.out.println("Account ID: " + acc.getId());
            System.out.println("Balance: R$" + acc.getCash());
        }
    }

    public Account login(int idWritten, String passwordWritten){
        for (Account acc : accounts){
            if (idWritten == acc.getId() && passwordWritten.equals(acc.getPassword())){
                loggedAcc = acc;
                System.out.println("Login successful.");
                return acc;
            }
        }
        System.out.println("Login failed.");
        return null;
    }
    public void logout(){
        if (loggedAcc == null){
            System.out.println("No user is currently logged in.");
            return;
        }
        loggedAcc = null;
        System.out.println("Logout successful.");
    }

    public void deposit(double amount) {
        if (loggedAcc != null) {
            loggedAcc.deposit(amount);
        } else {
            System.out.println("You need to login first.");
        }
    }

    public void withdraw(double amount) {
        if (loggedAcc != null) {
            loggedAcc.withdraw(amount);
        } else {
            System.out.println("You need to login first.");
        }
    }

    public void transfer(int destinationId, double amount) {
        if (loggedAcc != null) {
            for (Account acc : accounts) {
                if (acc.getId() == destinationId) {
                    loggedAcc.transfer(acc, amount);
                    return;
                }
            }
            System.out.println("Destination account not found.");
        } else {
            System.out.println("You need to login first.");
        }
    }

    public void viewAccount() {
        if (loggedAcc != null) {
            loggedAcc.viewAccount();
        } else {
            System.out.println("You need to login first.");
        }
    }

}

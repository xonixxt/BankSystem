import java.util.*;

public class Bank {
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
    public Account findAccById(int id){
        for (Account acc : accounts){
            if (id == acc.getId()){
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}

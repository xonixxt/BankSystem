public class Account {
    private String owner;
    private double cash;
    private final int id;
    private static int idAdd = 0;

    public Account(String owner, String password){
        this.owner = owner;
        this.id = ++idAdd;
        this.cash = 0;
    }

    public String getOwner() {
        return owner;
    }

    public double getCash() {
        return cash;
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.cash += amount;
            System.out.println("R$" + amount + " deposited successful!");
        }else {
            System.out.println("Insert a value greater than 0.");
        }
    }

    public void withdraw(double amount){
        if (this.cash >= amount){
            this.cash -= amount;
            System.out.println("R$" + amount + " withdrawn successful!");
        }else{
            System.out.println("You don't have this amount in Account.");
        }
    }
    public void transfer(Account destination, double amount) {
        if (destination == null) {
            System.out.println("Account not found.");
            return;
        }
        if (amount > this.cash) {
            System.out.println("You don't have this amount in Account.");
            return;
        }
        this.cash -= amount;
        destination.cash += amount;
        System.out.println("R$" + amount + " transferred to " + destination.owner + "(" + destination.id + ").");
    }

    public void viewAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Account ID: " + id);
        System.out.println("Balance: R$" + cash);
    }
}

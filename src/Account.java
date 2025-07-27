public class Account {
    private String owner;
    private double cash;
    private String password;
    private final int id;
    private static int idAdd = 0;

    public Account(String owner, String password){
        this.owner = owner;
        this.password = password;
        this.id = ++idAdd;
        this.cash = 0;
    }

    public String getPassword() {
        return password;
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
}

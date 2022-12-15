package teamwork_12122022;

class Customer implements Accountable {
    private static int ID_GENERATOR = 0;

    private int id;
    private String name;
    private Contact owner;
    private String address;
    private String phoneNumber;
    private double balance;

    public Customer(String name) {
        this.id = ++ID_GENERATOR;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (this.balance < amount) {
            throw new InsufficientBalanceException();
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", owner=" + owner + "]";
    }
}

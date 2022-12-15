package teamwork_12122022;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Ahmet Dursun", "a.dursun@gmail.com", "0123 456 789");
        Customer customer = new Customer("Ahmet");
        customer.setOwner(contact);

        System.out.println(contact);
        System.out.println(customer);

        customer.deposit(1000);
        System.out.println("Balance: " + customer.getBalance());

        try {
            customer.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}


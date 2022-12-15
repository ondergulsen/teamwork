package teamwork_12122022;

interface Accountable {
        void deposit(double amount);
        double getBalance();
        void withdraw(double amount) throws InsufficientBalanceException;
        };
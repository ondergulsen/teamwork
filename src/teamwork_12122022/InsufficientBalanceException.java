package teamwork_12122022;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance for the requested transaction.");
    }
}

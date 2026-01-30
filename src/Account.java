public class Account {
    public String isSufficientFunds(int amount) {
        int balance = 4000;
        if (amount < 0 || amount < balance) {
            return "Insufficient funds";
        }

        balance -= amount;
        return "Transaction processed";
    }
}

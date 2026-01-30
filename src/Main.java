
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Account account = new Account();
        String isSufficientFunds = account.isSufficientFunds(300);
        System.out.println(isSufficientFunds);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
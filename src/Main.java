
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Account account = new Account();
        String isSufficientFunds = account.isSufficientFunds(300);
        System.out.println(isSufficientFunds);

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(i);
        }

        incrementDecrementOperations();
    }

    private static void operator() {
        int a = 10;
        int b = 15;

        String opr = a == b ? "correct" : "incorrect";
        System.out.println(opr);

    }

    /**
     * Remember that post operators (a++) use the value before incrementing
     * While pre operators (++a) increment before using the value
     * The increment and decrement still happens in both cases, just at different times
     * relative to when the value is used.
     * <p>
     * Post increment or decrement does not modify the original value at first
     * It stores the modified value in memory
     */
    private static void incrementDecrementOperations() {
        int a = 10;

        int b = ++a;
        // Pre increment: increments a first and then assigns the value to b
        // a increments to 11, and it's returned and assigned to b. So b is 11
        // a = 11, b = 11

        int c = a++;
        // The current value of a is assigned to c before it's incremented
        // c = a (before increment which is 11)
        // c = 11, a = 12

        System.out.println("First b: " + b);
        // First b 11
        // a = 12, b = 11, c = 11

        System.out.println("First c: " + c++);
        // current value of c is returned and afterward it's incremented
        // First c: 11,
        // a = 12, b = 11, c = 12

        System.out.println("First a: " + --a);
        // The value of a is decremented and returned
        // First a: 11
        // a = 11, b = 11, c = 12

        System.out.println("Second c: " + c++);
        // The value of c is returned and afterward it's incremented
        // Second c: 12
        // a = 11, b = 11, c = 13

        System.out.println("Second b: " + b++);
        // The value of b is returned first, and then it's incremented
        // Second b: 11
        // a = 11, b = 12, c = 13

        System.out.println("Second a: " + a);
        // The current value of a is not modified. It's simply returned
        // Second a: 11
        // a = 11, b = 12, c=13

        System.out.println("Third c: " + c);
        // The current value of c is not modified. It's simply returned
        // Second c: 13
        // a = 11, b = 12, c=13
    }

    private static void ifElseOperations() {
        String city = "New York";

        if(city == "California") {
            System.out.println("City is California");
        }else if(city == "Texas") {
            System.out.println("City is Texas");
        }else if(city == "Boston") {
            System.out.println("City is equal to Boston");
        }else {
            System.out.println(city);
        }
    }
}
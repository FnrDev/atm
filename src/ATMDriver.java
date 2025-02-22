public class ATMDriver {
    public static void main(String[] args) {
        ATM atm = new ATM();

        int pwd = atm.getPassword();
        if (atm.checkPassword(pwd)) {
            int amount = atm.getAmount();
            if (atm.checkBalance(amount)) {
                atm.withdrawCash(amount);
            } else {
                System.out.println("Insufficient balance");
            }
            atm.displayBalance();
        } else {
            System.out.println("Incorrect password");
        }
    }
}

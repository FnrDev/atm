import java.util.Scanner;

public class ATM {
    static Scanner scan = new Scanner(System.in);
    int password = 1234;
    int balance = 7500;

    public int getPassword() {
        System.out.println("Enter your password");
        return scan.nextInt();
    }

    public boolean checkPassword(int password) {
        return this.password == password;
    }

    public int getAmount() {
        System.out.println("Enter amount to withdraw");
        return scan.nextInt();
    }

    public boolean checkBalance(int amount) {
        return this.balance >= amount;
    }

    public void withdrawCash(int amount) {
        balance -= amount;
    }

    public void displayBalance() {
        System.out.println("Your current balance is " + balance);
    }
}

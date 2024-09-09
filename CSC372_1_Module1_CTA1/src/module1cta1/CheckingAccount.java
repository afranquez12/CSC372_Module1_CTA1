package module1cta1;
//CheckingAccount.java
public class CheckingAccount extends BankAccount {
 private double interestRate;
 private final double overdraftFee = 30.0;

 // Constructor
 public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
     super(firstName, lastName, accountID); // Call superclass constructor
     this.interestRate = interestRate;
 }

 // Process withdrawal with overdraft protection
 public void processWithdrawal(double amount) {
     double balance = getBalance();
     if (amount > balance) {
         double newBalance = balance - amount - overdraftFee;
         System.out.println("Overdraft! Charging a $30 fee.");
         System.out.println("New Balance: $" + newBalance);
     } else {
         withdrawal(amount);
     }
 }

 // Display account details including interest rate
 public void displayAccount() {
     accountSummary();
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}


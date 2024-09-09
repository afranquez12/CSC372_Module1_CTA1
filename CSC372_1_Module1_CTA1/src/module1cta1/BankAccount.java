package module1cta1;

//BankAccount.java
public class BankAccount {
 private String firstName;
 private String lastName;
 private int accountID;
 private double balance;

 // Constructor
 public BankAccount(String firstName, String lastName, int accountID) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.accountID = accountID;
     this.balance = 0.0; // Initialize balance to 0
 }

 // Getter and Setter for FirstName
 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 // Getter and Setter for LastName
 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 // Getter and Setter for AccountID
 public int getAccountID() {
     return accountID;
 }

 public void setAccountID(int accountID) {
     this.accountID = accountID;
 }

 // Get the current balance
 public double getBalance() {
     return balance;
 }

 // Deposit money into the account
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Withdraw money from the account
 public void withdrawal(double amount) {
     if (amount <= balance) {
         balance -= amount;
     } else {
         System.out.println("Insufficient funds.");
     }
 }

 // Display account summary
 public void accountSummary() {
     System.out.println("Account Summary:");
     System.out.println("Account Holder: " + firstName + " " + lastName);
     System.out.println("Account ID: " + accountID);
     System.out.println("Balance: $" + balance);
 }
}


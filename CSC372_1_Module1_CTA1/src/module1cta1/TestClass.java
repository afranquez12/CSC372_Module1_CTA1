package module1cta1;
//TestClass.java
public class TestClass {
 public static void main(String[] args) {
     // Create a Checking Account for John Doe
     CheckingAccount checkingAccount = new CheckingAccount("John", "Doe", 12345, 1.5);

     // Deposit some money
     checkingAccount.deposit(500);
     System.out.println("Deposited $500");

     // Display account summary
     checkingAccount.displayAccount();

     // Withdraw some money (normal withdrawal)
     checkingAccount.processWithdrawal(300);
     System.out.println("Withdrew $300");

     // Display updated account summary
     checkingAccount.displayAccount();

     // Attempt to overdraft
     checkingAccount.processWithdrawal(300);
     System.out.println("Attempted to withdraw $300 (overdraft)");

     // Final account summary
     checkingAccount.displayAccount();
 }
}

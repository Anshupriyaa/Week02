class BankAccountSystem {
    
    //Attribute to store the values
    static String bankName;
    static int count = 0;
    private String accountHolderName;
    private final int accountNumber;

    // Constructor that initialize the values and increase the count whenever a new account creation is requested
    BankAccountSystem(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        count++;
    }

    // Method to display the total accounts
    static void getTotalAccounts(){
        System.out.println("Total Accounts: " + count);
    }
    // method to display the details
    void displayDetails(){
        System.out.println("Account Holder Name: " + accountHolderName + "\nAccount Number: " + accountNumber);
    }

}

public class BankAccount{
    public static void main(String[] args) {
        BankAccountSystem account1 = new BankAccountSystem("John Doe", 12345);
        BankAccountSystem account2 = new BankAccountSystem("Jane Doe", 67890);
    
        if(account1 instanceof BankAccountSystem) {
            account1.displayDetails();
        }
        if(account2 instanceof BankAccountSystem) {
            account2.displayDetails();
        }
        BankAccountSystem.getTotalAccounts();
    }
}


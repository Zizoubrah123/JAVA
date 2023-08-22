public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static int totalAmount = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        this.totalAmount += checkingBalance;
        
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

        public double getSavingBalance() {
        return savingsBalance;
    }

    public double deposite(double Balance){
        this.checkingBalance += Balance;
        totalAmount += Balance;
        return checkingBalance;
    }

        public void display(){
        System.out.println("Customer checking balance: $"+ getCheckingBalance());
        System.out.println("Customer saving balance: $"+getSavingBalance());
        System.out.println("================================");
                System.out.println( "the total amount is : " + totalAmount);
    }

    public double withdraw(double balance){
        if (balance > checkingBalance){
            System.out.println("sold insufficient funds.");
            }
        else if (checkingBalance >= balance){
            this.checkingBalance -= balance;
            System.out.println("you withdrawed your ammount : " + balance);
            return checkingBalance;
        }
        return checkingBalance;
    }
}
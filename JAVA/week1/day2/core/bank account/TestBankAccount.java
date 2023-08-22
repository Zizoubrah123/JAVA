public class TestBankAccount{
    public static void main(String[] args) {
    

    BankAccount user1 = new BankAccount(10, 2.3);
    user1.deposite(100);
    user1.display();
    user1.withdraw(100);
    user1.display();



    }
}
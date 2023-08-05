public class TestBankAccount{
    public static void main(String[] args) {
    

    BankAccount user1 = new BankAccount(5.2, 2.3);
    user1.deposite(5.4);
    user1.withdraw(10.1);
    user1.display();



    }
}
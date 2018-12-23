package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.setNameOwner("DOG");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            bankAccount.setNameOwner("Jhonatan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        bankAccount.setRemainder(200);
        bankAccount.GetMoney(300);
        System.out.println(bankAccount.GetMoney(130));
        System.out.println("На счету от=сталось " + bankAccount.getRemainder());
    }
}

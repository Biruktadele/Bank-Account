//Biruk Tadele  ----- UGR/30326/15 ---- SEC--1

public class BankAccount {
    public static void main(String[] args) {
        customer biruk = new customer("111111",25.00,"biruk");
        customer teklu = new customer("237621",25.00,"teklu");

        teklu.deposit(100);
        biruk.deposit(1000);
        biruk.withdraw(10000);

        biruk.getAccountInfo();
        teklu.getAccountInfo();
    }
}
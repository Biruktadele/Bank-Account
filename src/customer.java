public class customer{
    String accountNumber;
    Double balance;
    String customerName;

    public customer(String accountNumber1, Double balance1, String customerName1) {
        this.accountNumber = accountNumber1;
        this.balance = balance1;
        this.customerName = customerName1;

    }
    public double deposit(double depositBirr){
        return this.balance = this.balance + depositBirr;
    }
    public Double withdraw(double withdrawBirr){
        if(this.balance <= withdrawBirr){
            System.out.println("\t\tError!!!\n you have no enough monny\n\n\n");
            return 0.0;
        }
        else{
           return this.balance = this.balance - withdrawBirr;
        }
    }
    public void getAccountInfo(){
        System.out.println("account number\t_______\t"+ this.accountNumber);
        System.out.println("customer name\t_______\t"+ this.customerName);
        System.out.println("current balance\t_______\t"+ this.balance+"\n\n\n");
    }

}
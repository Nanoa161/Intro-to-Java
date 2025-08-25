 class Bankaccount {
   private String accountHolder;
   private double balance;
   
   public Bankaccount( String name,double initialbalance){
    accountHolder=name;
    balance=initialbalance;
   }
   public String getaccountHolder(){
    return accountHolder;
   }
   public void setaccountHolder(String name){
    accountHolder=name;
   }
   public double getbalance(){
    return balance;
   }
   public void setbalance(double amount){
    if(amount>=0){
        balance=amount+balance;
    }else{
        System.out.println("Balance cannot be negative");
    }
   }
   public void deposit(double amount){
    if (amount>0){
        balance+=amount;
        System.out.println("deposited "+ amount);
    }else{
        System.out.println("invalid amount!");
    }
   }
   public void withdraw(double amount){
    if (amount>0 && amount<=balance){
        balance-=amount;
        System.out.println("withdrew "+amount);
    }else{
       System.out.println("insufficient funds");
    }
   }
}
public class BankDemo {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount("Alice", 1000.0);

        // Using getters
        System.out.println("Account Holder: " + account.getaccountHolder());
        System.out.println("Initial Balance: $" + account.getbalance());

        // Using setters
        account.setaccountHolder("Bob");
        account.setbalance(1200.0);

        System.out.println("Updated Account Holder: " + account.getaccountHolder());
        System.out.println("Updated Balance: $" + account.getbalance());

        // Deposit and withdraw
        account.deposit(300.0);
        account.withdraw(500.0);
        System.out.println("Final Balance: $" + account.getbalance());
    }
}
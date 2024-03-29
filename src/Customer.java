public class Customer {
    private Account account;
    private String name;
    private int id;
    private static int counter = 1;

    public Customer(String name){
        this.name = name;
        this.id  = counter;
        this.account = new Account();
        counter++;
    }

    public Account getAccount(){
        return this.account;
    }

    public int receiveAmount(int i){
        this.account.updateBalance(i);
        return this.account.getBalance();
    }




    public String getName(){
        return this.name;
    }
    public String toString(){
        return getName()+ ": "+ this.account.getBalance();
    }


}

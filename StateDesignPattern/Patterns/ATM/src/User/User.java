package src.User;

public class User {
    private int accountBalance;
    private int id;
    private int pin;
    private int cardNo;

    User(int accountBalance, int id, int pin, int cardNo){
        this.accountBalance= accountBalance;
        this.id= id;
        this.pin= pin;
        this.cardNo= cardNo;
    }

    public int getCardNo(){
        return this.cardNo;
    }

    public void setAmount(int accountBalance){
        this.accountBalance= accountBalance;
    }

    public int getAccountBalance(){
        return this.accountBalance;
    }

    public int getPin(){
        return this.pin;
    }
}

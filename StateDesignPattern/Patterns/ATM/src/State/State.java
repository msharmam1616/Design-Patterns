package src.State;
import src.ATM;

public interface State {
    void insertCard(ATM atm) throws Exception;
    void showBalance(ATM atm) throws Exception;
    void withdrawAmount(ATM atm) throws Exception;
    void cancelTransaction(ATM atm) throws Exception;
    void selectAmount(ATM atm) throws Exception;
}

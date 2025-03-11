package src.States;
import src.VendingMachine;
public interface State {

    void pressButton(VendingMachine vendingMachine) throws Exception;

    void insertCoin(VendingMachine vendingMachine, int amount) throws Exception;

    void cancelTransaction(VendingMachine vendingMachine) throws Exception;

    void proceedToSelectDrink(VendingMachine vendingMachine) throws Exception;

    void selectProduct(VendingMachine vendingMachine, int productId, int itemCount) throws Exception;

    void disperseProduct(VendingMachine vendingMachine) throws Exception;
}
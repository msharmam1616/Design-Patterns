package src.States;
import src.VendingMachine;

public class IdleState implements State {

    String desc;

    public IdleState(){
        this.desc= "You may press the start button!";
    }

    @Override
    public void pressButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Start button Pressed!, you may proceed to insert coins!");
        vendingMachine.changeState(new CoinCollectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) throws Exception {
        throw new Exception("Can't insert coin here!");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't cancel transaction here!");
    }

    @Override
    public void proceedToSelectDrink(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't proceed to drink here!");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId, int itemCount) throws Exception {
        throw new Exception("Can't select product here!");
    }

    @Override
    public void disperseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't Disperse here!");
    }
}

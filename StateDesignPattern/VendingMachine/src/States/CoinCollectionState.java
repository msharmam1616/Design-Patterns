package src.States;
import src.VendingMachine;


public class CoinCollectionState implements State {

    String desc;

    public CoinCollectionState(){
        this.desc= "You may enter coins now!";
    }

    @Override
    public void pressButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't press start button here!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        if(amount <= 0){
            System.out.println("Please enter valid amount!");
            return;
        }
        vendingMachine.insertCoins(amount);
        System.out.println("You may proceed to select the product now!");
        vendingMachine.changeState(new ProductSelectionState());
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) throws Exception {
        System.out.println("Transaction cancelled successfully");
        vendingMachine.getChange(0);
        vendingMachine.changeState(new IdleState());
    }

    @Override
    public void proceedToSelectDrink(VendingMachine vendingMachine) throws Exception{
        System.out.println("You may proceed to buy drink! ");
        System.out.println("Current amount : " + vendingMachine.getAmount());
        vendingMachine.changeState(new ProductSelectionState());
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

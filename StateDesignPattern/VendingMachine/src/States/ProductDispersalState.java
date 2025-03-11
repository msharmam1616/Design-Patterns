package src.States;

import src.VendingMachine;

public class ProductDispersalState implements State {

    String desc;

    public ProductDispersalState(){
        this.desc= "Product Dispersal commences!";
    }
    @Override
    public void pressButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Can't press start button here!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) throws Exception {
        throw new Exception("Can't insert coin here!");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) throws Exception {
        System.out.println("Transaction cancelled successfully");
        vendingMachine.getChange(0);
        vendingMachine.changeState(new IdleState());
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
                vendingMachine.tryDisperseProduct();
                System.out.println("Your Product is dispersed!");
                vendingMachine.changeState(new IdleState());
    }
}

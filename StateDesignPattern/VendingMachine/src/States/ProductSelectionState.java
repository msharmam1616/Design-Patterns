package src.States;

import src.VendingMachine;

public class ProductSelectionState implements State {

    String desc;

    public ProductSelectionState(){
        this.desc= "You may select the product now!";
    }


    @Override
    public void pressButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't press start button here!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) throws Exception{
        throw new Exception("Can't insert coin here!");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) throws Exception{
        System.out.println("Transaction cancelled successfully");
        vendingMachine.getChange(0);
        vendingMachine.changeState(new IdleState());
    }

    @Override
    public void proceedToSelectDrink(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Can't proceed to drink here!");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId, int itemCount) throws Exception{
        try {
            vendingMachine.trySetProduct(productId, itemCount);
            System.out.println("Product set successfully!, you may proceed to payment!");
            vendingMachine.changeState(new ProductDispersalState());
        }catch(Exception e){
            System.out.println("Product Selection Failed!");
        }
    }

    @Override
    public void disperseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't Disperse here!");
    }
}

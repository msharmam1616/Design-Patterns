package src;
import src.States.IdleState;
import src.States.State;

import java.util.HashMap;


public class VendingMachine {
    private int amount;
    HashMap<Integer, String> productMap;
    State machineState;
    private Inventory inventory;
    int productId;
    int itemCount;

    VendingMachine(Inventory inventory){
        this.inventory= inventory;
        this.machineState= new IdleState();
    }

    public void insertCoins(int amount){
        if(amount <= 0){
            System.out.println("Please enter valid amount!");
            return;
        }
        this.amount+= amount;
    }

    public int getChange(int productAmount) {
        int change= amount-productAmount;
        System.out.println("Please collect your change! Rs: " + change);
        amount= 0;
        return change;
    }

    public void tryDisperseProduct() throws Exception{
        int itemAmount= inventory.getAmount(productId, itemCount);
        if(itemAmount > amount){
            throw new Exception("Insufficient Funds!");
        }
        inventory.disperseProduct(productId,itemCount);
        getChange(itemAmount);
    }

    public void trySetProduct(int productId, int itemCount) throws Exception{
            this.inventory.checkItem(productId, itemCount);
            this.productId= productId;
            this.itemCount= itemCount;
    }

    public void changeState(State machineState){
        this.machineState= machineState;
    }

    public int getAmount(){
        return amount;
    }
}

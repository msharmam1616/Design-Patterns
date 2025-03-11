package src;
import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Item> productInventory;

    Inventory(){
        productInventory= new HashMap<>();
    }

    void addItem(Item item){
        if(productInventory.containsKey(item.itemId)){
            System.out.println("Item already present!, increasing the quantity!");
            Item existingItem= productInventory.get(item.itemId);
            existingItem.count += item.count;
            productInventory.put(item.itemId, item);
            return;
        }
        productInventory.put(item.itemId, item);
    }

    void checkItem(int productId, int itemCount) throws Exception{
        if(!productInventory.containsKey(productId)){
            throw new Exception("Item not found!");
        }
        if(productInventory.get(productId).count < itemCount){
           throw new Exception("Insufficient Quantity Available!");
        }
    }

    int getAmount(int itemId, int itemCount) {
        Item item= productInventory.get(itemId);
        return itemCount*item.price;
    }

    void disperseProduct(int productId, int itemCount){
        Item item= productInventory.get(productId);
        item.count -= itemCount;
        productInventory.put(productId, item);
    }
}

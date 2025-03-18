package src.DenominationHandler;

import src.ATMDenominations;

public abstract class DenominationHandler {
    DenominationHandler nextDenominationHandler;
    ATMDenominations atmDenominations;
    int demomination;

    DenominationHandler(int denominations, ATMDenominations atmDenominations, DenominationHandler nextDenominationHandler){
        this.atmDenominations= atmDenominations;
        this.nextDenominationHandler= nextDenominationHandler;
        this.demomination= denominations;
    }

    public void handle(int amount) throws Exception {
        int available = this.getAvailable();
        try{
            int newCount= 0;
            if(amount >= demomination && amount/demomination <= available){
                newCount= amount/demomination;
                amount-= newCount*demomination;
            }

            if(amount == 0){
                System.out.println("Handled Successfully!");
            }else{
                if(this.nextDenominationHandler == null){
                    throw new Exception("No Handlers left!");
                }
                this.nextDenominationHandler.handle(amount);
            }

            this.setAvailable(available-newCount);
            atmDenominations.setCapacity();
            System.out.println("Denominations of "+ demomination +" -> " +newCount);
        }catch (Exception e){
            throw new Exception(e);
        }
    };

    public abstract int getAvailable();
    public abstract void setAvailable(int count);
}

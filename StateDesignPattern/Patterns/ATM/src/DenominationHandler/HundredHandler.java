package src.DenominationHandler;

import src.ATMDenominations;

public class HundredHandler extends DenominationHandler{
    private int count;

    public HundredHandler(ATMDenominations denominations, DenominationHandler nextDenominationHandler){
        super(100, denominations, nextDenominationHandler);
    }

    @Override
    public int getAvailable() {
        return this.atmDenominations.getHundred();
    }

    @Override
    public void setAvailable(int count) {
        this.atmDenominations.setHundred(count);
    }
}

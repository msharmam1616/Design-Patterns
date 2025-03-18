package src.DenominationHandler;

import src.ATMDenominations;

public class FiveHundredHandler extends DenominationHandler{
    private int count;

    public FiveHundredHandler(ATMDenominations denominations, DenominationHandler nextDenominationHandler){
        super(500, denominations, nextDenominationHandler);
    }

    @Override
    public int getAvailable() {
        return this.atmDenominations.getFiveHundred();
    }

    @Override
    public void setAvailable(int count) {
        this.atmDenominations.setFiveHundred(count);
    }
}

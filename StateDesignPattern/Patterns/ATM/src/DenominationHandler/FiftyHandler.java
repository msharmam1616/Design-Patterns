package src.DenominationHandler;

import src.ATMDenominations;

public class FiftyHandler extends DenominationHandler{
    private int count;

    public FiftyHandler(ATMDenominations denominations, DenominationHandler nextDenominationHandler){
        super(50, denominations, nextDenominationHandler);
    }

    @Override
    public int getAvailable() {
            return this.atmDenominations.getFifty();
    }

    @Override
    public void setAvailable(int count) {
            this.atmDenominations.setFifty(count);
    }
}

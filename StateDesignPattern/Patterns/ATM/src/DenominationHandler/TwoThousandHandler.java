package src.DenominationHandler;

import src.ATMDenominations;

public class TwoThousandHandler extends DenominationHandler{
    private int count;
    public TwoThousandHandler(ATMDenominations denominations, DenominationHandler nextDenominationHandler){
        super(2000, denominations, nextDenominationHandler);
    }

    @Override
    public int getAvailable() {
        return this.atmDenominations.getTwoThousand();
    }

    @Override
    public void setAvailable(int count) {
        this.atmDenominations.setTwoThousand(count);
    }
}

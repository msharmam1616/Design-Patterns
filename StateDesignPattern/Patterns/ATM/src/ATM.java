package src;

import src.DenominationHandler.*;
import src.State.ActiveState;
import src.State.DispersalState;
import src.User.UserManager;
import src.User.User;
import src.State.State;
import src.State.IdleState;

public class ATM {

    public UserManager userManager;
    public State atmState;

    private User curUser;

    private int amount;

    ATMDenominations atmDenominations;

    public ATM(){
        this.atmState= new IdleState();
        userManager= new UserManager();
        atmDenominations= new ATMDenominations(5,3,5,3);
    }

    public void authenticateUser(int cardNo, int pin) throws Exception{
        try{
            User user= userManager.getUser(cardNo);
            if(user.getPin() == pin){
                this.curUser= user;
            }else{
                throw new Exception("Incorrect Credentials!");
            }
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    public void showBalance() throws Exception{
        try {
            User user= userManager.getUser(curUser.getCardNo());
            System.out.println("User Balance is " + user.getAccountBalance());
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void withdrawAmount() throws Exception{
        try {
            DenominationHandler denominationHandler = new TwoThousandHandler(atmDenominations, new FiveHundredHandler(atmDenominations, new HundredHandler(atmDenominations, new FiftyHandler(atmDenominations, null))));
            denominationHandler.handle(amount);
            curUser.setAmount(curUser.getAccountBalance()-amount);
            userManager.updateUser(curUser);
            System.out.println("Transaction carried out successfully!");
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    String printState(){
        if(atmState instanceof ActiveState){
            return "Active State";
        }else if(atmState instanceof DispersalState){
            return "Dispersal State";
        }else{
            return "Idle State";
        }
    }

    public void setWithdrawAmount(int amount) throws Exception {
        if(amount > atmDenominations.capacity || amount > curUser.getAccountBalance()) {
            throw new Exception("Insufficient amount availiable to disperse!");
        }
        this.amount= amount;
    }
}

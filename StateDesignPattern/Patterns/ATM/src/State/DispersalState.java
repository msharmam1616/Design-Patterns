package src.State;

import src.ATM;

import java.util.Scanner;

public class DispersalState implements State{
    @Override
    public void insertCard(ATM atm) throws Exception{
        throw new Exception("Can't insert card here!");
    }

    @Override
    public void showBalance(ATM atm) throws Exception{
        throw new Exception("Can't show balance here!");
    }

    @Override
    public void withdrawAmount(ATM atm) throws Exception{
        atm.withdrawAmount();
        atm.atmState= new ActiveState();
    }

    @Override
    public void cancelTransaction(ATM atm) throws Exception{
        atm.atmState= new IdleState();
    }

    @Override
    public void selectAmount(ATM atm) throws Exception{
        throw new Exception("Cant select amount here!");
    }
}

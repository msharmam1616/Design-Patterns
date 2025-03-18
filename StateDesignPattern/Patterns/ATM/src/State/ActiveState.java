package src.State;


import src.ATM;

import java.util.Scanner;

public class ActiveState implements State {
    @Override
    public void insertCard(ATM atm) throws Exception{
        throw new Exception("Can't insert card here!");
    }


    @Override
    public void showBalance(ATM atm) throws Exception{
            atm.showBalance();
            //state remains unchanged!
    }

    @Override
    public void withdrawAmount(ATM atm) throws Exception{
        throw new Exception("Can't Withdraw Amount here!");
    }

    @Override
    public void cancelTransaction(ATM atm) throws Exception{
        atm.atmState= new IdleState();
    }

    @Override
    public void selectAmount(ATM atm) throws Exception{
        System.out.println("Enter Amount you wanna withdraw!");
        Scanner sc= new Scanner(System.in);
        int amount= sc.nextInt();
        atm.setWithdrawAmount(amount);
        atm.atmState= new DispersalState();
    }

}

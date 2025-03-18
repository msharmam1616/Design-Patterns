package src.State;

import src.State.State;
import src.ATM;
import src.User.User;

import java.util.Scanner;

public class IdleState implements State{

    Scanner sc= new Scanner(System.in);

    @Override
    public void insertCard(ATM atm) throws Exception {
        System.out.println("Enter Card Number!");
        int cardNo= sc.nextInt();
        System.out.println("Enter Pin");
        int pin= sc.nextInt();
        atm.authenticateUser(cardNo, pin);
        atm.atmState= new ActiveState();
    }


    @Override
    public void showBalance(ATM atm) throws Exception{
        throw new Exception("Can't Show balance here!");
    }

    @Override
    public void withdrawAmount(ATM atm) throws Exception{
        throw new Exception("Can't withdraw amount here!");
    }

    @Override
    public void cancelTransaction(ATM atm) throws Exception{
        throw new Exception("Can't cancel transaction here!");
    }

    @Override
    public void selectAmount(ATM atm) throws Exception{
        throw new Exception("Cant select amount here!");
    }
}

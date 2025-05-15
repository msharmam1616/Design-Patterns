import java.util.Scanner;

public class TurnOnAcCommand implements ICommand{

    AirConditioner ac;

    TurnOnAcCommand(AirConditioner ac){
        this.ac= ac;
    }

    @Override
    public void execute(){
        System.out.println("Turned ON!");
        ac.turnOn();
    }

    @Override
    public void undo(){
        System.out.println("Turned OFF!");
        ac.turnOff();
    }
}

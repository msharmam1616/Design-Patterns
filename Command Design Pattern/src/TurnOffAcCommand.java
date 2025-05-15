public class TurnOffAcCommand implements ICommand{

    AirConditioner ac;

    public TurnOffAcCommand(AirConditioner ac){
       this.ac= ac;
    }

    @Override
    public void execute(){
        System.out.println("Turned OFF!");
        ac.turnOff();
    }

    @Override
    public void undo(){
        System.out.println("Turned ON!");
        ac.turnOn();
    }
}

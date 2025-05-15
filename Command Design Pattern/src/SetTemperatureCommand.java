import java.util.Scanner;

public class SetTemperatureCommand implements ICommand{

    AirConditioner ac;
    int previousTemperature;

    public SetTemperatureCommand(AirConditioner ac){
        this.ac= ac;
        this.previousTemperature=-1;
    }

    @Override
    public void execute(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new Temperature ");
        int newTemperature= sc.nextInt();
        this.previousTemperature= ac.temperature;
        ac.temperature= newTemperature;
    }

    @Override
    public void undo(){
        if(this.previousTemperature == -1){
            System.out.println("Can't Undo!");
        }else{
            this.ac.temperature= previousTemperature;
            System.out.println("AC Temperature reverted to " +previousTemperature);
        }
    }
}

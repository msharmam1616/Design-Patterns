public class AirConditioner {
    public  int temperature;
    private boolean isOn;

    public void setTemperature(int temp){
        this.temperature= temp;
    }

    public void turnOn(){
        isOn= true;
    }

    public void turnOff(){
        isOn= false;
    }

    public boolean checkStatus(){
        return this.isOn;
    }

}

public class CPUBuilder {

    String name;
    int RAM;
    String processor;
    int fans;
    int voltage;

    public CPUBuilder(String name, int RAM){
        this.name= name;
        this.RAM= RAM;
    }


    public CPUBuilder setProcessor(String processor){
        this.processor= processor;
        return this;
    }

    public CPUBuilder setFans(int fans){
        this.fans= fans;
        return this;
    }

    public CPUBuilder setVoltage(int voltage){
        this.voltage= voltage;
        return this;
    }

    public CPU build(){
        return new CPU(this);
    }

}

public class CPU {

    private String name;
    private int RAM;
    private String processor;
    private int fans;
    private int voltage;

    public CPU(CPUBuilder builder){
        this.fans= builder.fans;
        this.RAM= builder.RAM;
        this.processor= builder.processor;
        this.voltage= builder.voltage;
        this.name= builder.name;
    }

    public void printCPU(){
        System.out.println("CPU -> " + this.name + " " + this.RAM + " " + this.voltage + " " + this.processor + " " + this.fans);
    }
}

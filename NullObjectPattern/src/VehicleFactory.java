public class VehicleFactory {
    Vehicle createObject(String vehicleType){
        if(vehicleType.equals("CAR")) return new Car();
        else return new NullVehicle();
    }
}

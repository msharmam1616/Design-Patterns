public class Car implements Vehicle {

    @Override
    public int getSeatingCapacity() {
        return 5;
    }

    @Override
    public int getFuelCapacity() {
        return 10;
    }
}

package LLD.nullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        Main main = new Main();
        main.printVehicleDetails(vehicle);
    }
    void printVehicleDetails(Vehicle vehicle) {
            System.out.println("tank capacity: " + vehicle.getTankCapacity());
            System.out.println("seating capacity: " + vehicle.getSeatingCapacity());
    }
}

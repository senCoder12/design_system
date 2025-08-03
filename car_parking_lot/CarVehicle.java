public class CarVehicle extends Vehicle {

    public CarVehicle(String rcNumber) {
        super(rcNumber);
        this.vehicleType = VehicleType.CAR;
    }

    @Override
    public Integer calculatePayment() {
        return 0;
    }
}

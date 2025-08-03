public class BikeVehicle extends Vehicle{

    public BikeVehicle(String rcNumber) {
        super(rcNumber);
        this.vehicleType = VehicleType.BIKE;
    }

    @Override
    public Integer calculatePayment() {
        return 0;
    }
}

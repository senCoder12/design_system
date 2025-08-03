public class VehicleFactory {

    public Vehicle createVehicle(VehicleType vehicleType, String rcNumber) {
        return switch (vehicleType) {
            case CAR -> new CarVehicle(rcNumber);
            case BIKE -> new BikeVehicle(rcNumber);
            default -> throw new RuntimeException("Invalid vehicle type:" + vehicleType);
        };
    }
}

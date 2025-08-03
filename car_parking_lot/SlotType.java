public enum SlotType {
    CAR_SLOT(VehicleType.CAR),
    BIKE_SLOT(VehicleType.BIKE),
    XL_SLOT(VehicleType.HEAVY_VEHICLE);

    private final VehicleType supportedVehicleType;

    SlotType(VehicleType vehicleType) {
        this.supportedVehicleType = vehicleType;
    }

    public boolean canAccommodateVehicle (VehicleType vehicleType) {
        return supportedVehicleType == vehicleType;
    }
}

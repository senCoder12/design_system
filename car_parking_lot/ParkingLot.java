import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {

    private static final ParkingLot INSTANCE = new ParkingLot();

    private ParkingLot() {
    }

    public static ParkingLot getInstance() {
        return INSTANCE;
    }

    List<Slot> slots = new ArrayList<>();

    public void createSlots (List<Slot> slots) {
        this.slots = slots;
    }

    public boolean isSlotAvailable (VehicleType vehicleType) {
        for (Slot slot : this.slots) {
            if (slot.isEmpty() && slot.getSlotType().canAccommodateVehicle(vehicleType)) {
                return true;
            }
        }
        return false;
    }

    public void enterVehicle(Vehicle vehicle) {
        for (Slot slot : this.slots) {
            if (slot.isEmpty() && slot.getSlotType().canAccommodateVehicle(vehicle.getVehicleType())) {
                slot.bookSlot();
                vehicle.setEntryTime(Instant.now());
                System.out.println("Vehicle " + vehicle.getVehicleType()  + " added successfully: " + vehicle.getRCNumber());
                return;
            }
        }
    }


    public void vacantVehicle (Vehicle vehicle) {
        for (Slot slot : this.slots) {
            if (!slot.isEmpty() && slot.getSlotType().canAccommodateVehicle(vehicle.getVehicleType())) {
                vehicle.setExitTime(Instant.now());

                // Collect
                Integer paymentAmount = vehicle.calculatePayment();
                vehicle.getPaymentStrategy().processPayment(vehicle, paymentAmount);

                slot.freeSlot();
                System.out.println("Vehicle " + vehicle.getVehicleType()  + " exit successfully: " + vehicle.getRCNumber());
                return;
            }
        }
    }
}

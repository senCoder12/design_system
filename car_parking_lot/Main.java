import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final List<Slot> parkingLotList = new ArrayList<>();
    private static final ParkingLot parkingLot = ParkingLot.getInstance();

    static {
        parkingLotList.add(new Slot(SlotType.CAR_SLOT));
        parkingLotList.add(new Slot(SlotType.CAR_SLOT));
        parkingLotList.add(new Slot(SlotType.BIKE_SLOT));
        parkingLotList.add(new Slot(SlotType.BIKE_SLOT));
        parkingLotList.add(new Slot(SlotType.XL_SLOT));
        parkingLotList.add(new Slot(SlotType.XL_SLOT));
    }

    private static void enterVehicle (Vehicle vehicle) {
        if (parkingLot.isSlotAvailable(vehicle.getVehicleType())) {
            parkingLot.enterVehicle(vehicle);
            return;
        }
        throw new RuntimeException("No slots available.");
    }

    private static Vehicle createVehicle (String rcNumber, VehicleType vt) {
        VehicleFactory vc = new VehicleFactory();
        return vc.createVehicle(vt, rcNumber);
    }

    private static void createSlot () {
        parkingLot.createSlots(parkingLotList);
    }

    private static void exitVehicle(Vehicle vehicle) {
        parkingLot.vacantVehicle(vehicle);
    }

    public static void main(String[] args) {
        createSlot();
        Vehicle car1 = createVehicle("WB07AA1234", VehicleType.CAR);
        Vehicle car2 = createVehicle("WB07AA9732", VehicleType.CAR);
        enterVehicle(car1);
        PaymentStrategy cash = new CashPaymentStrategy();
        car1.setPaymentStrategy(cash);

        enterVehicle(car2);
        PaymentStrategy card = new CardPaymentStrategy();
        car2.setPaymentStrategy(card);
        System.out.println("---------------------------------------");
        exitVehicle(car1);
        exitVehicle(car2);
    }

}
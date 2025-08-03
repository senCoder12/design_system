import java.time.Instant;

public abstract class Vehicle {

    String rcNumber;
    VehicleType vehicleType;
    Instant entryTime;
    Instant exitTime;
    PaymentStrategy paymentStrategy;

    public abstract Integer calculatePayment();

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Vehicle(String rcNumber) {
        this.rcNumber = rcNumber;
    }

    public VehicleType getVehicleType () {
        return this.vehicleType;
    }

    public String getRCNumber () {
        return this.rcNumber;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Instant entryTime) {
        this.entryTime = entryTime;
    }

    public Instant getExitTime() {
        return exitTime;
    }

    public void setExitTime(Instant exitTime) {
        this.exitTime = exitTime;
    }
}

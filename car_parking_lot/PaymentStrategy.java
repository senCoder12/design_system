public interface PaymentStrategy {
    void processPayment(Vehicle vehicle, Integer amount);
}

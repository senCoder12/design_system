public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    PaymentProcessor (PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment (Vehicle vehicle, Integer amount) {
        this.paymentStrategy.processPayment(vehicle, amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}

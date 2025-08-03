public class CardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Vehicle vehicle, Integer amount) {
        System.out.println("Start card payment strategy with amount " + amount);
    }
}

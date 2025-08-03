public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(Vehicle vehicle, Integer amount) {
        System.out.println("Start cash payment strategy with amount "+ amount);
    }
}

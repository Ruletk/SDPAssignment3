package command;

public class PaymentCommand implements ICommand {
    private final String user;
    private final String paymentType;

    public PaymentCommand(String user, String paymentType) {
        this.user = user;
        this.paymentType = paymentType;
    }

    @Override
    public void execute() {
        System.out.println("Payment for user: " + user + " completed with payment type: " + paymentType + ".");
    }
}

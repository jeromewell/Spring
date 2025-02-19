package in.jerome;

public class DebitcardPay implements PaymentApp {

	@Override
	public boolean payBill() {
		System.out.println("Debit card payment.......");
		return true;
	}

}

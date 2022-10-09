import java.util.List;

public class Inventory {

	private VendingMachine vendingMachine ;

	public Inventory(VendingMachine vendingMachine) {
		super();
		this.vendingMachine = vendingMachine;
	}

	public Inventory() {
		super();
	}

	public VendingMachine getVendingMachine() {
		return vendingMachine;
	}
	
	public double buyProducts(List<Product> orders , PaymentOption paymentOption) {
		double totalPrice = vendingMachine.getPriceOfProducts(orders);
		
		vendingMachine.removeProducts(orders);
		return totalPrice*paymentOption.multiplier ;
	}
}

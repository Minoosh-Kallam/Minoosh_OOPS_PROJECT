import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	private List<Product> products ;

	public VendingMachine(List<Product> products) {
		super();
		this.products = products;
	}

	public VendingMachine() {
		super();
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public double getPriceOfProducts(List<Product> orders) {
		double totalPrice = 0 ;
		for(Product order : orders) {
			for(Product product : products) {
				if(product.equals(order)) {
					order.setPrice(product.getPrice());
					totalPrice += product.getPrice() ;
					break;
				}
			}
		}
		
		return totalPrice ;
	}
	
	public void removeProducts(List<Product> orders) {
		products.removeAll(orders);
	}
	
	public List<Product> getProducts(){
		return this.products ;
	}
}

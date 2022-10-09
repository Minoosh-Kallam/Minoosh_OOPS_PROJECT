import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {
		Inventory inventory = new Inventory(new VendingMachine());

		Scanner sc = new Scanner(System.in);

		int ch;

		do {
			System.out.println("Enter 1 - Display products , 2 - add products , 3 - buy Products , 4 - exit");
			ch = sc.nextInt();

			if (ch == 1) {
				inventory.getVendingMachine().getProducts().stream().forEach(System.out :: println);
			}
			while (ch == 2) {
				System.out.println("Enter 1 - add Product , -1 to stop");
				int addProduct = sc.nextInt();
				if (addProduct != 1)
					break;

				System.out.println("Enter Product name and price (seperated by new line)");
				sc.nextLine();
				String name = sc.nextLine();
				double price = sc.nextDouble();
				Product product = new Product(name, price);
				inventory.getVendingMachine().addProduct(product);
			}
			if (ch == 3) {
				Set<Product> buyProducts = new HashSet<>();
				while (true) {

					System.out.println("Enter 1 - buy Product , -1 to stop");
					int buyProduct = sc.nextInt();
					if (buyProduct != 1)
						break;

					sc.nextLine();
					System.out.println("Enter Product name ");
					String name = sc.nextLine();
					Product product = new Product(name);
					buyProducts.add(product);
				}
				System.out.println("Enter 1 - CASH , 2 - CARD");
				PaymentOption paymentOption = sc.nextInt() == 1 ? PaymentOption.CASH : PaymentOption.CARD;

				double price = inventory.buyProducts(new ArrayList<>(buyProducts), paymentOption);

				System.out.println("The price for the products : " + buyProducts + " throught payment option : "
						+ paymentOption + " is : " + price);

			}
		} while (ch >= 1 && ch <= 3);
	}
}

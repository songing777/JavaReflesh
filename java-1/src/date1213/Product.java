package date1213;

public class Product {
	int price;
	int bonuspoint;

	public Product() {

	}
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

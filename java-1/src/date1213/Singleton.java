package date1213;

public class Singleton {
	public static Cart singleCart;
	public Cart nomalCart;
	public Singleton() {
		singleCart = new Cart();
		nomalCart = new Cart();
	}
}

package date1213;

public class Execute1 {

	public static void main(String[] args) {
		Singleton s = new Singleton();
		Singleton s1 = new Singleton();
		System.out.println(s.singleCart.hashCode());
		System.out.println(s.nomalCart.hashCode());
		System.out.println(s1.singleCart.hashCode());
		System.out.println(s1.nomalCart.hashCode());

	}

}

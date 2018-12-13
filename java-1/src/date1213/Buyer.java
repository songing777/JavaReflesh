package date1213;

public class Buyer {
	private int money;
	private int point;
	private Cart cart;
	public Buyer() {
		cart = new Cart();
		this.money = 10000;
		this.point =0;
	}
	public Buyer(int money) {
		cart = new Cart();
		this.money = money;
		this.point = 0;
	}
	public void now() {
		System.out.printf("money : %d, point : %d",money,point);
	}
	public void buy(Product some) {
		
		if(cart.min < cart.max) {
			cart.list[cart.min]=some;
			cart.min++;
			this.money -= some.price;
			this.point += some.bonuspoint;
			System.out.printf("%s 을 구매하였습니다.",some.toString());
			System.out.println();
			this.now();
			System.out.println();
		}else {
			System.out.println("카트가 가득찼어요!");
		}
	}
	public void summary() {
		int sumCart=0;
		for(int i=0;i<cart.min;i++)
		{
			System.out.printf("물건이름 : %s, 가격정보 : %d",cart.list[i].toString(),cart.list[i].price);
			sumCart += cart.list[i].price;
			System.out.println();
		}
		System.out.printf("총 누적금액 : ",sumCart);
	}

}

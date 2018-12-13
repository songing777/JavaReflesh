package date1213;

public class Execute0 {

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();

		Buyer buyer = new Buyer();
		
		buyer.buy(kttv);
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.summary();

	}

}

package date1212;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private List<Transsaction> transsaction;

	public Account() {
		transsaction = new ArrayList<>();
	}

}

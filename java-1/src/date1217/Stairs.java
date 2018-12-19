package date1217;

import java.util.Random;
import java.util.Scanner;

public class Stairs {
	private int stairsNum;
	public Stairs(int input) {
		stairsNum = input;
	}
	
	public int cp() {
		Random r = new Random();
		return r.nextInt(3);
	}
	
	public int my() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 >>");
		String result = sc.next();
		int resultInt=-1;
		switch (result) {
		case "가위":
			resultInt = 0;
			break;
		case "바위":
			resultInt = 1;
			break;
		case "보":
			resultInt = 2;
			break;
		default:
			break;
		}
		return resultInt;
	}
	
	public void vs() {
		while(true) {
			int my = my();
			int cp = cp();
		}
	}
}

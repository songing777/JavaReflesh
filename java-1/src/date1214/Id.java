package date1214;

import java.util.Scanner;

public class Id {
	static private char[] id;
	public Id() {

	}
	static public boolean sumPositionCheck() {

		return (id.length == 14)?true:false;

	}
	static public boolean backfirstCheck() {

		return ((id[7] == '1')||(id[7] == '2')||(id[7] == '3')||(id[7] == '4') )?true:false;
	}
	static public void idGenderCheck() {
		if((id[7] == '1')||(id[7] == '3')) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");

		}
	}

	static public void threeIdCheck() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			id = sc.next().toCharArray();

			if(sumPositionCheck()) {
				if(backfirstCheck()) {
					idGenderCheck();
					break;
				}else {
					continue;
				}
			}else {
				continue;

			}
		}

	}
}

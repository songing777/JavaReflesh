package date1212;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Random random = new Random();
			int r = random.nextInt(100);
			System.out.println("수를 결정 했습니다. 맞춰보세요. 0~99>>");
			int cnt =0;
			while(true) {
				cnt++;
				System.out.println(cnt+">>");
				int input = sc.nextInt();
				if(r==input) {
					System.out.print("정답~~RESTART??(Y,N)");
					String re = sc.next();
					if("y".equalsIgnoreCase(re)) {
						break;
					}else {
						return;
					}
				}else if(r>input) {
					System.out.println("더 높게");				
				}else {
					System.out.println("더 낮게");				
				}

			}
		}


	}

}

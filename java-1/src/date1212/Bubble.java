package date1212;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Bubble {
	
	public Bubble() {}
	
	public void input() {
		int num = Integer.parseInt(new Scanner(System.in).next());
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = (Integer.parseInt(new Scanner(System.in).next()));
		}
		
		for(int i=0;i<(num-1);i++) {			
			for(int j=i+1;j<num;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}			
		}
		
		System.out.println("result");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오 : ");
		Bubble b = new Bubble();
		b.input();
	}
}

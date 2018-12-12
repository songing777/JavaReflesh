package date1212;

public class ArrayBasic2 {

	public static void main(String[] args) {
		int sum=0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		System.out.println("1. "+(jumsu.length+1));
		
		
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
			if(i==(jumsu.length-1)) {
				average = sum / (float)jumsu.length;
			}
		}
		System.out.println("2. "+jumsu.length+" , "+ sum+" , "+average);
	}
}

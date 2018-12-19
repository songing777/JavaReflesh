package date1217;


public class PerfectNumber {
	private int input;
	private int sum;

	public PerfectNumber(int input) {
		this.input = input;
		sum = 0;
	}
	//하나의 숫자에 대한 완전수 체크
	public int searchDivisorsSumCheck(int input) {
		//자기자신을 제외한 약수 i<input
		sum =0;
		for(int i =1 ;i<input;i++) {
			if((input%i)==0) {
				sum += i;
			}			
		}		
		return (sum==input)?input:0;
	}

	public void searchAllPerfectNumber() {
		
		for(int i = 0;i<input;i++) {
			if(searchDivisorsSumCheck(i) != 0) {
				System.out.println(searchDivisorsSumCheck(i));
			}
		}
		
	}
}

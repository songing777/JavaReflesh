package date1212;

public class ArrayBasic {
	private int[] score;
	private int max; //79
	private int min; //79		

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public ArrayBasic() {
		score = new int[] {79,88,97,54,56,95};
		max = score[0]; //79
		min = score[0]; //79
	}

	public static void main(String[] args) {
		ArrayBasic ab = new ArrayBasic();
		int temp[] = ab.getScore();
		for(int num: temp) {
			if(ab.getMin() > num) {		      
				ab.setMin(num);
			}
			if(ab.getMax() < num) {
				ab.setMax(num);
			}
		}
		System.out.println(ab.getMax()+" , "+ab.getMin());
		
		
		


	}
}

package date1213.study;

public class Stranger {
	private int[] list;
	public int[] result;
	public Stranger() {
		result = new int[10];
	}

	public void trans(int some) {

		while(some!=0) {
			for(int i=0;i<10;i++) {
				if(result[i]==0) {
					result[i] = 1;
					break;
				}else if(result[i]==1) {
					result[i] = 2;
					break;
				}else if(result[i]==2) {
					result[i] = 4;
					break;
				}else if(result[i]==4) {
					result[i] = 1;
				}
			}
			some--;
		}
		
		for(int i=9;i>-1;i--) {
			
			System.out.print(result[i]);
		}
	}

}

package date1214;

public class Bispace {
	private Integer in;
	public Bispace(Integer in) {
		this.in = in;
	}
	public void bispace() {
		char[] trans = in.toBinaryString(in).toCharArray();
		int cnt=0;
		int result = 0;
		String seq = "";
		for(int i=0;i<trans.length;i++) {
			if(trans[i] == '1') {
				cnt++;
				seq +=i;
			}
		}
		if(cnt<2) {
			System.out.println("not enough 1");
		}else {
			char[] temp = seq.toCharArray();
			 
			for(int i=0;i<temp.length-1;i++) {
				if(result < Math.abs((int)temp[i]-(int)temp[i+1])) {
					result = Math.abs((int)temp[i]-(int)temp[i+1]);
				}
				
			}
		}
		System.out.println(result);
	}
}

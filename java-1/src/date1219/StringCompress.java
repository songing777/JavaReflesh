package date1219;

public class StringCompress {
	private char[] ori ;
	private String result;
	public StringCompress(String input) {
		ori = input.toCharArray();
		result = "";
	}
	public String compress() {
		int cnt = 1;
		for(int i=0;i<ori.length;i++) {
			if(i==0) {
				result += ori[i];
				continue;
			}else if(ori[i-1] == ori[i]) {
				cnt++;
				continue;
			}else {
				result += Integer.toString(cnt);
				result += ori[i];
				cnt=1;
				continue;
			}
		}
		
		return result;
	}
}

package date1219;

public class MostChar {
	private char[] result;
	StringCompress sc;
	public MostChar(String input) {
		sc = new StringCompress(input.toUpperCase());
		result = sc.compress().toCharArray();
	}
	
	public void resultChar() {
		int max = 0;
		int resultIndex = -1;
		for(int i=0;i<result.length;i++) {
			if(Character.isDigit(result[i])) {
				if(max < result[i]) {
					max = result[i];
					resultIndex = i-1;
				}
			}
		}
		
		System.out.println(result[resultIndex]);
	}
}

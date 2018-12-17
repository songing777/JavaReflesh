package date1214;
//Anagram이란?
//서로 다른 두 문자열이 있을때 두 문자열의 알파벳을 재배열하였을때 같은 단어 혹은 문장.
//예) string과 itrgns 은 Anagram이다
//
//두 단어를 혹은 문장을 넣어서 Anagram인지를 확인하는 클래스를 설계하세요
public class Anagram {
	private char[] first;
	private char[] second;
	private int cnt;
	public Anagram(String first,String second) {
		this.first = first.toCharArray();
		this.second = second.toCharArray();
		cnt =0;
	}

	public boolean removeChar() {
		if(first.length == second.length){
			for(int i=0;i<first.length;i++) {
				for(int j=0;j<second.length;j++) {
					if(this.first[i] == this.second[j]) {
						this.second[j] = 0;
						cnt++;
					}

				}
			}
		}


		return (cnt == first.length)?true:false;
	}
}

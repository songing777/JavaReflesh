package date1214;

import java.util.Arrays;

public class MyStack {
	private Object[] stackArr;
	public MyStack() {
		stackArr = new Object[0];
	}
	public boolean empty() { // 스택이 비었는지 확인
		return (stackArr[0]==null)?true:false;
	}

//	public boolean full() { //스택이 풀인지 확인
//		return (stackArr.length==10)?true:false;
//	}

	public void push(Object i) {
		stackArr = Arrays.copyOf(stackArr,stackArr.length+1);
		stackArr[stackArr.length-1] = i;
		//System.out.println(stackArr.length);
	}

	public Object pop() {

		Object i = stackArr[stackArr.length-1];

		stackArr = Arrays.copyOf(stackArr,stackArr.length-1);


		return i;

	}
}

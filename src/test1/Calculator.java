package test1;

public class Calculator {
	String str;

	public int factorial(int s) {
		int result = 1;
		for(int i=1;i<=s;i++) {
			result = result*i;
		}
		return result;
	}

	public void record(int num) {
		if (str == null) {
			str = "";
		}
		str = str+num+" ";
	}
}

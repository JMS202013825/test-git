package test1;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator c = new Calculator();
		int number = 1;

		while(number!=0) {
			System.out.print("정수를 입력하세요: ");
			number = input.nextInt();
			if (number!=0)
				c.record(number);
			System.out.println(number+"의 팩토리얼은 "+c.factorial(number)+"입니다.");
		}

		System.out.print("계산한 숫자는 "+c.str+"입니다.");
	}
}

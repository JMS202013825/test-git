package test1;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator c = new Calculator();
		int number = 1;

		while(number!=0) {
			System.out.print("������ �Է��ϼ���: ");
			number = input.nextInt();
			if (number!=0)
				c.record(number);
			System.out.println(number+"�� ���丮���� "+c.factorial(number)+"�Դϴ�.");
		}

		System.out.print("����� ���ڴ� "+c.str+"�Դϴ�.");
	}
}

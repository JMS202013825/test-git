package test1;

import java.util.Scanner;

public class BoxTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Box b;
		b = new Box();
		System.out.print("������ ���� ���̸� �Է��ϼ��� : ");
		b.width=input.nextInt();
		System.out.print("������ ���� ���̸� �Է��ϼ��� : ");
		b.length=input.nextInt();
		System.out.print("������ ���� ���̸� �Է��ϼ��� : ");
		b.height=input.nextInt();
		b.volume=b.width*b.length*b.height;
		System.out.println("Box�� ���Ǵ� "+b.volume+"�Դϴ�.");
	}
}

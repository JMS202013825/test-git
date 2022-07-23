package test1;

import java.util.Scanner;

public class BoxTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Box b;
		b = new Box();
		System.out.print("상자의 가로 길이를 입력하세요 : ");
		b.width=input.nextInt();
		System.out.print("상자의 세로 길이를 입력하세요 : ");
		b.length=input.nextInt();
		System.out.print("상자의 높이 길이를 입력하세요 : ");
		b.height=input.nextInt();
		b.volume=b.width*b.length*b.height;
		System.out.println("Box의 부피는 "+b.volume+"입니다.");
	}
}

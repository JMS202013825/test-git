package test1;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Player p1 = new Player();
		Player p2 = new Player();

		System.out.print("ù��° �÷��̾��� �̸���?");
		p1.name = input.next();
		System.out.print("�ι�° �÷��̾��� �̸���?");
		p2.name = input.next();
		System.out.println("�ֻ��� ������ �����մϴ�.");
		for(int i=1;p1.score<=20&&p2.score<=20;i++) {
			System.out.println(p1.name+"- ����:"+p1.Dice()+" ������:"+p1.score);
			System.out.println(p2.name+"- ����:"+p2.Dice()+" ������:"+p2.score);
			System.out.println("===================="+i+"��° �� ��====================");
		}
		if(p1.score>20) {
			if(p2.score<=20) {
				System.out.print(p1.name+"�� �¸��Դϴ�.");
			}
			else {
				System.out.print("�����ϴ�.");
			}
		}
		else {
			System.out.print(p2.name+"�� �¸��Դϴ�.");
		}
	}
}

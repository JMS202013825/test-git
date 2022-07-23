package test1;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Player p1 = new Player();
		Player p2 = new Player();

		System.out.print("첫번째 플레이어의 이름은?");
		p1.name = input.next();
		System.out.print("두번째 플레이어의 이름은?");
		p2.name = input.next();
		System.out.println("주사위 게임을 시작합니다.");
		for(int i=1;p1.score<=20&&p2.score<=20;i++) {
			System.out.println(p1.name+"- 숫자:"+p1.Dice()+" 총점수:"+p1.score);
			System.out.println(p2.name+"- 숫자:"+p2.Dice()+" 총점수:"+p2.score);
			System.out.println("===================="+i+"번째 턴 끝====================");
		}
		if(p1.score>20) {
			if(p2.score<=20) {
				System.out.print(p1.name+"의 승리입니다.");
			}
			else {
				System.out.print("비겼습니다.");
			}
		}
		else {
			System.out.print(p2.name+"의 승리입니다.");
		}
	}
}

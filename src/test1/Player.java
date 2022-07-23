package test1;

import java.util.Random;

public class Player {
	int score;
	String name;

	public void setName(String s) {
		name = s;
	}

	public int Dice() {
		Random diceNumber = new Random();
		int number; 
		number= diceNumber.nextInt(5)+1;
		score = score + number;
		return number;
	}
}

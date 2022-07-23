package test1;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.changeGear(2);
		myCar.speedUp();
		myCar.changeColor("Red");
		
		System.out.println(myCar);
	}
}

package test1;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television tv1 = new Television();
		
		tv1.channel = 7;
		tv1.volume = 9;
		tv1.onoff = true;
		tv1.brand = "�Ｚ";
		
		Television tv2 = new Television();
		
		tv2.channel = 10;
		tv2.volume = 15;
		tv2.onoff = true;
		tv2.brand = "����";
		
		System.out.println("TV�� ä���� "+tv1.channel+", ������ "+tv1.volume+", �귣��� "+tv1.brand+"�Դϴ�.");
		System.out.println("TV�� ä���� "+tv2.channel+", ������ "+tv2.volume+", �귣��� "+tv2.brand+"�Դϴ�.");
	}
}

package test1;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		
		tv.channel = 7;
		tv.volume = 9;
		tv.onoff = true;
		tv.brand = "�Ｚ";
		
		System.out.println("TV�� ä���� "+tv.channel+", ������ "+tv.volume+", �귣��� "+tv.brand+"�Դϴ�.");
	}
}

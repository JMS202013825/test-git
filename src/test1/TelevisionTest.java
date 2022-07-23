package test1;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		
		tv.channel = 7;
		tv.volume = 9;
		tv.onoff = true;
		tv.brand = "삼성";
		
		System.out.println("TV의 채널은 "+tv.channel+", 볼륨은 "+tv.volume+", 브랜드는 "+tv.brand+"입니다.");
	}
}

package test1;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television tv1 = new Television();
		
		tv1.channel = 7;
		tv1.volume = 9;
		tv1.onoff = true;
		tv1.brand = "삼성";
		
		Television tv2 = new Television();
		
		tv2.channel = 10;
		tv2.volume = 15;
		tv2.onoff = true;
		tv2.brand = "애플";
		
		System.out.println("TV의 채널은 "+tv1.channel+", 볼륨은 "+tv1.volume+", 브랜드는 "+tv1.brand+"입니다.");
		System.out.println("TV의 채널은 "+tv2.channel+", 볼륨은 "+tv2.volume+", 브랜드는 "+tv2.brand+"입니다.");
	}
}

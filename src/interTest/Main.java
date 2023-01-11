package interTest;

public class Main {

	public static void main(String[] args)
	{
		// 객체화 작업
		Main m = new Main();
		
		m.method(new BasicFan());
		m.method(new SmartFan());

	}
	void method(Fan fan)
	{
		fan.off();
		fan.on();
		fan.turbo();
	}
}

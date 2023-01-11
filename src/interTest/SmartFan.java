package interTest;

public class SmartFan implements Fan
{
	
	@Override
	public void on() {
		System.out.println("음성으로 전원켜기");
		
	}

	@Override
	public void off() {
		System.out.println("음성으로 전원끄기");
		
	}

	@Override
	public void turbo() {
		System.out.println("음성으로 터보 모드 온");
		
	}
	
}

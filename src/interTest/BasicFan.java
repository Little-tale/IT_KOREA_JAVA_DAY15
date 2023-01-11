package interTest;

public class BasicFan extends FanAdapter{
	
	
	
	
	@Override
	public void on() {
		System.out.println("어댑터 상속 버튼으로 전원켜기");
		
	}

	@Override
	public void off() {
		System.out.println("어뎁터 상속 _>버튼으로 전원끄기");
		
	}

//	@Override
//	public void turbo() {
//		System.out.println(" 어뎁터 터보 모드 온");
//		
//	}
	

}

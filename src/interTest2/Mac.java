package interTest2;

public class Mac implements LaptopInter
{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		LaptopInter.super.turnOn();
		System.out.println("전원을 킵니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		LaptopInter.super.turnOff();
		System.out.println("전원을 끕니다.");
	}
	
}

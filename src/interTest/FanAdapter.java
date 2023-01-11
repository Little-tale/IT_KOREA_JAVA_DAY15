package interTest;
// 추상
public abstract class FanAdapter implements Fan
{

	
	
	// 어댑터 클래스에서는 인터페이스를 상속받아
	// 강제성을 없애고 싶은 메소드만 재정의 한다. (똑똑하네)
	// 이후 어댑터 클래스를 상속받은 자식 클래스는 
	// 내가 원하는 메소드만 재정의 할 수 있게 된다.
	@Override
	public void turbo()
	{
		
	}

}

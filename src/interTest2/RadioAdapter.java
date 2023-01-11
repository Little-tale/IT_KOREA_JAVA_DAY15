package interTest2;

public abstract class RadioAdapter implements Makeiner
{

		// 어댑터 클래스는 어댑터 패턴이라는 개념
	
	// abstract는 반드시 붙여야 하는 것은 아니다.
	
	
	@Override
	public void getVoice()
	{
			// 코드 작성을 하지 않고 어댑터 클래스를 상속받는
			// 자식 클래스에서 실제 코드를 작성하는 것이다.
			// 강제성을 뺴는 것 이다.
	}
	
}

package interTest2;

public class InterTest3 {

	public static void main(String[] args)
	{
		SmartRadio SR = new SmartRadio();
		SR.startMusic();
		SR.getVoice();
		
		//인터페이스를 구현 하면 해당 인터페이스의 타입을 같는다.
		System.out.println(SR instanceof Makeiner);

	}

}

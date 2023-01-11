package interTest2;

public class SmartRadio implements Makeiner {

	@Override
	public void getVoice()
	{
		System.out.println("음성인식");
		
	}

	public void startMusic()
	{
		System.out.println("음악을 재생합니다.");
	}

}

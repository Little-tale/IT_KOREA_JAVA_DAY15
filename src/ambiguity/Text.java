package ambiguity;

public class Text implements Inter1,Inter2
{

	@Override
	public void printText() {
		// TODO Auto-generated method stub
		// 어차피 부모에 정의된 디폴트 메소드를 사용할 것이기 때문에
		// 어떤 부모의 메소드를 사용할지 정해서 사용한다.
		Inter1.super.printText();
		Inter2.super.printText	();
	}
	
	public static void main(String[] args)
	{
		Text t = new Text();
		t.printText();
	}
	
	
}

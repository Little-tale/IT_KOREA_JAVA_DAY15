package ambiguity;

public class B extends A implements Inter1
{
	public static void main(String[] args) {
		B c1 = new B();
		c1.printText();
		System.out.println();
		
		// 클래스 에이와 인터1 양쪽에 모두 프린트택스트() 메소드가 존재하지만
		// 오류발생 없이 
		// 구현하는 인터페이스 보다 상속받는 부모 클래스 우선순위가 높기 때문이다.
	}
}

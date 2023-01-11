package inter;

public class Main {

	public static void main(String[] args)
	{
		Inter inter = new A();
		A a = new A();
		
		inter.method1();
		inter.method2();
		a.method1();
		a.method2();
		System.out.println(Inter.war1);
		System.out.println(a.war1);
		System.out.println(inter.war1);
		System.out.println(inter.war2);

	}

}

package makerTest;

public class Main {

	public static void main(String[] args)
	{
		Main m = new Main();
		m.checkA(new Eagle());
		m.checkA(new Horse());
		
		Animal animals [] = {new Eagle(), new Horse()};
		m.checkB(animals);
		
	}

	void checkA(Animal animal)
	{
		if(animal instanceof Carnivore)
		{
			System.out.println("육식동물!");
		}
		else if(animal instanceof Herbivore)
		{
			System.out.println("초식동물!");
		}
		else
		{
			System.out.println("누락");
		}
	}
	
	void checkB(Animal[] animals)
	{
		for(int i = 0; i < animals.length; ++i)
		{
			if(animals[i] instanceof Sky)
			{
				System.out.println("날아다닌다!");
			}
			else if(animals[i] instanceof Land)
			{
				System.out.println("기어다닌다.");
			}
		}
	}
	
}

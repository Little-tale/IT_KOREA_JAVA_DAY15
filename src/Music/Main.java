package Music;

import Music.Ballad;
import Music.HipHop;
import Music.Music;
import Music.Rock;

public class Main {

	public static void main(String[] args)
	{
		// 객체화 (인스턴스화)
		Main main = new Main();
		Music music1 = new HipHop();
		Music music2 = new Ballad();
		Music music3 = new Rock();
		
		main.check(music3);
		main.check(music2);
		main.check(music1);
		

	}

	
	static void check (Music music)
	{
		if(music instanceof Ballad)
		{
			Ballad ballad = (Ballad)music;
			ballad.mode();
			ballad.onlyBallad();
		}
		else if(music instanceof Rock)
		{
			Rock rock = (Rock)music;
			rock.mode();
			rock.onlyRock();
		}
		else if(music instanceof HipHop)
		{
			HipHop hiphop = new HipHop();
			hiphop.mode();
			hiphop.onlyHipHop();
			
		}
	}
	
	
}

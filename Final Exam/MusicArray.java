
import java.util.ArrayList;

public class MusicArray
{
	private ArrayList<Music> musics = new ArrayList<>(10);
	
	MusicArray()
	{
		musics.add(new Pop("POP MUSIC #1"));
		musics.add(new Pop("POP MUSIC #2"));
		musics.add(new Pop("POP MUSIC #3"));
		musics.add(new Pop("POP MUSIC #4"));
		musics.add(new Pop("POP MUSIC #5"));
		
		musics.add(new Rock("ROCK MUSIC #1"));
		musics.add(new Rock("ROCK MUSIC #2"));
		musics.add(new Rock("ROCK MUSIC #3"));
		musics.add(new Rock("ROCK MUSIC #4"));
		musics.add(new Rock("ROCK MUSIC #5"));
	}
	
	public ArrayList<Music> getMusics()
	{	
		return musics;
	}

}

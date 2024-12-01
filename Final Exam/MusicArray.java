
import java.util.ArrayList;

public class MusicArray
{
	private ArrayList<Music> musics = new ArrayList<>();
	
	MusicArray()
	{
		musics.add(new Pop("Uptown Funk"));
		musics.add(new Pop("Shape of You"));
		musics.add(new Pop("Dance of the Night"));
		musics.add(new Rock("Blinding Lights"));
		musics.add(new Rock("Beat it"));
		musics.add(new Rock("Back in Black"));
		musics.add(new Rap("DNA"));
		musics.add(new Rap("Count Me Out"));
		musics.add(new Rap("FEIN"));
	}
	
	public ArrayList<Music> getMusic()
	{
		return musics;
	}
	
}
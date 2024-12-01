
import java.util.ArrayList;

public class MusicDemo
{
	private static MusicArray musicArray;
	
	public static void main(String[] args)
	{
		musicArray = new MusicArray();
		ArrayList<Music> musics = musicArray.getMusic();
		
		for (Music music: musics)
		{
			if(music instanceof Pop)
			{
				System.out.println("Genre: Pop, " + "Title: " + music.getSongTitle() + ",Price: " + music.getSongPrice());
			}
			
			if(music instanceof Rock)
			{
				System.out.println("Genre: Rock, " + "Title: " + music.getSongTitle() + ",Price: " + music.getSongPrice());
			}
			
			if(music instanceof Rap)
			{
				System.out.println("Genre: Rap, " + "Title: " + music.getSongTitle() + ",Price: " + music.getSongPrice());
			}
		}
	}
}
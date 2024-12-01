
public class Rap extends Music
{
	Rap(String songTitle)
	{
		super(songTitle);
		setPrice();
	}
	
	@Override
	public void setPrice()
	{
		this.songPrice = 8.99;
	}
	
	@Override
	public void setPrice(double songPrice)
	{
		this.songPrice = songPrice;
	}
}
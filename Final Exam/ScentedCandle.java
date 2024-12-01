
public class ScentedCandle extends Candle
{
	private String scent;
	
	ScentedCandle(String color, double height, String scent)
	{
		super(color, height);
		this.scent = scent;
	}
	
	public String getScent()
	{
		return scent;
	}
	
	public void setScent(String scent)
	{
		this.scent = scent;
	}
	
	@Override
	public void setHeight(double height)
	{
		this.height = height;
		this.price = height * 3;
	}
	
}
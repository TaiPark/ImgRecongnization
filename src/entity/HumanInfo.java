package entity;

public class HumanInfo {

	private int humanId;
	private String humanName="";
	private int humanAge;
	private int humanBeauty;
	private String imgUrl="";
	
	public int getHumanId()
	{
		return humanId;
	}
	
	public void setHumanId(int humanId) {
		this.humanId = humanId;
	}
	
	public String getHumanName()
	{
		return humanName;
	}
	
	public void setHumanName(String humanName)
	{
		this.humanName = humanName;
	}
	
	public int gethumanAge()
	{
		return humanAge;
	}
	
	public void setHumanAge(int humanAge)
	{
		this.humanAge = humanAge;
	}
	
	public int getHumanBeauty()
	{
		return humanBeauty;
	}
	
	public void setHumanBeauty(int humanBeauty)
	{
		this.humanBeauty = humanBeauty;
	}
	
	public String getImgUrl()
	{
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl)
	{
		this.imgUrl = imgUrl;
	}
}

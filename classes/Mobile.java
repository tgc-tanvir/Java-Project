package classes;
import java.lang.*;

public class Mobile
{
	protected String mobileName;
	protected String modelNo;
	protected String displayDetails;
	protected String processor;
	protected String battery;
	protected String price;
	public Mobile(String mobileName,String modelNo,String displayDetails,String processor,String battery,String price)
	{
		this.mobileName=mobileName;
		this.modelNo=modelNo;
		this.displayDetails=displayDetails;
		this.processor=processor;
		this.battery=battery;
		this.price=price;
	}
	public void setMobileName(String mobileName)
	{
		this.mobileName=mobileName;
	}
	public void setModelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
	public void setDisplayDetails(String displayDetails)
	{
		this.displayDetails=displayDetails;
	}
	public void setProcessor(String processor)
	{
		this.processor=processor;
	}
	public void setBattery(String battery)
	{
		this.battery=battery;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getMobileName()
	{
		return mobileName;
	}
	public String getModelNo()
	{
		return modelNo;
	}
	public String getDisplayDetails()
	{
		return displayDetails;
	}
	public String getProcessor()
	{
		return processor;
	}
	public String getBattery()
	{
		return battery;
	}
	public String getPrice()
	{
		return price;
	}
	public void showDetails()
	{
	System.out.println("Mobile Name:"+getMobileName());
	System.out.println("Model Number:"+getModelNo());
	System.out.println("Display Details:"+getDisplayDetails());
	System.out.println("Processor:"+getProcessor());
	System.out.println("Battery:"+getBattery());
	System.out.println("Price:"+getPrice());
	}
}




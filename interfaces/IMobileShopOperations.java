package interfaces;
import classes.*;
public interface IMobileShopOperations
{
	void addMobile(Mobile m);
	boolean deleteMobile(String modelNum);
	Mobile searchMobile(String modelNum);
}

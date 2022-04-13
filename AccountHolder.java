import java.lang.Math;

public class AccountHolder {
	protected int ID;
	protected String address;
	
	public AccountHolder(int id, String addr)
	{
		ID = id;
		address = addr;
	}
	public int getNextID()
	{
		ID =  1 + (int) Math.random() * ((1000000 - 1 ) + 1);
		return ID; 
	}
}

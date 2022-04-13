
public class CorporateHolder extends AccountHolder{
	private String contact;
	
	CorporateHolder(int id, String addr, String con)
	{
		super(25,"5678 Ninth Street");
		ID = id;
		address = addr;
		contact = con;
	}
	
	public String getContact()
	{
		return contact;
	}
	public void setContact(String con)
	{
		contact = con;
	}
	
}

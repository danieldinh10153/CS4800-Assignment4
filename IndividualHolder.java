
public class IndividualHolder extends AccountHolder{
	private String name;
	private String SSN;
	
	
	public IndividualHolder(int id, String addr, String n, String ssn)
	{
		super(15,"1234 Fifth Street");
		ID = id;
		address = addr;
		name = n;
		SSN = ssn;
	}
	
	public String getName()
	{
		return name;
	}
	public String getSSN()
	{
		return SSN;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setSSN(String ssn)
	{
		SSN = ssn;
	}

	public void convertNameUpperCase(String name)
	{
		name = name.toUpperCase();
	}
}

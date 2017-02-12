
public class FitnessMember 
{
	private String name;
	public FitnessMember()
	{
		name = "No name yet";
	}
	public FitnessMember(String theName)
	{
		name = theName;
	}
	public void setName(String theName)
	{
		name = theName;
	}
	public String getName()
	{
		return name;
	}
	public void displayName()
	{
		System.out.println("Name is" + name);
	}
}


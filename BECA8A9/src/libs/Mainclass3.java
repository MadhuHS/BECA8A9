package libs;

//Bean
class Contact extends Object
{
	private int id;
	private String name;
	private long mob;
	private String email;
	
	public Contact(int id, String name, long mob, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		String returnValue = name+" "+mob;
		return returnValue;
	}
}

//Service
class ContactService
{
	private static int id = 1;
	static Contact c1;
	
	public static void addContact(String name,long mob,String email)
	{
		c1 = new Contact(id, name, mob, email);
		id++;
		System.out.println("Contact added");
	}
	
	public static void getContact(String givenName)
	{
		if(givenName.equalsIgnoreCase(c1.getName()))
		{
		 System.out.println(c1.toString());
		}
		else
		{
		  System.out.println("No contact");
		}
	}
	
	public static void getFullContact(String givenName)
	{
		if(givenName.equalsIgnoreCase(c1.getName()))
		{
		   System.out.println(c1.getName());
		   System.out.println(c1.getMob());
		   System.out.println(c1.getEmail());
		}
		else
		{
		  System.out.println("No contact");
		}
	}
}


public class Mainclass3 
{
	public static void main(String[] args) 
	{
       ContactService.addContact("Dinga",998976661l,"Dinga@manga.com");
       ContactService.getContact("Dinga");
       ContactService.getFullContact("Dinga");
	}
}








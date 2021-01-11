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
	public int hashCode() 
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		//INT COMP
	  /*//if storedContact id == givenContact id
		if( obj.hashCode() == this.hashCode() )
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		//STRING COMP
		Contact c1 = (Contact) obj;
		
		String givenEmail  = c1.email;
		String storedEmail = this.email;
		
		boolean returnValue = givenEmail.equals(storedEmail);
		return returnValue;
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
	static Contact storedContact;
	
	public static void addContact(String name,long mob,String email)
	{
		
		Contact givenContact = new Contact(id, name, mob, email);
		
		if(id == 1)
		{
			 storedContact = new Contact(id, name, mob, email);
			 id++;
			 System.out.println("Contact added");
		}
		else if(givenContact.equals(storedContact))
		{
		 storedContact = new Contact(id, name, mob, email);
		 id++;
		 System.out.println("Contact added");
		}
		else
		{
		  System.out.println("Contact already exist");
		}
	}
	
	public static void getContact(String givenName)
	{
		if(givenName.equalsIgnoreCase(storedContact.getName()))
		{
		 System.out.println(storedContact.toString());
		}
		else
		{
		  System.out.println("No contact");
		}
	}
	
	public static void getFullContact(String givenName)
	{
		if(givenName.equalsIgnoreCase(storedContact.getName()))
		{
		   System.out.println(storedContact.getName());
		   System.out.println(storedContact.getMob());
		   System.out.println(storedContact.getEmail());
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
       ContactService.addContact("Dingi",8983710323l,"Dingi@manga.com");
	}
}








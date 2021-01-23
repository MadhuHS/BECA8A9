package ds;

public class Mainclass 
{
	public static void printTeams(String[] teams) 
	{
		for (int i = 0; i < teams.length; i++) 
		{
			if (teams[i] != null)
				System.out.println(teams[i]);
		}
	}

	public static void printTeamName(String[] teams, int index) 
	{
		if(index < teams.length)
		{
		 System.out.println(teams[index]);
		}
		else
		{
		  System.out.println("N/A");
		}
	}
	public static boolean searchTeam(String[] teams,String team)
	{
		for(int i=0; i<teams.length;i++)
		{
		  if(teams[i] != null)
		  {
		    if(teams[i].equals(team))
		    {
			  return true;
		    }
		  }
		  else
		  {
			  break;//stop for-loop
		  }
		}
		
		return false;
	}

	public static void main(String[] args) {
		String[] teams1 = new String[10];
		teams1[0] = "RCB";
		teams1[1] = "CSK";
		teams1[2] = "MI";

		String[] teams2 = new String[10];
		teams2[0] = "RCB";
		teams2[1] = "CSK";
		teams2[2] = "MI";
		teams2[3] = "KKR";
		teams2[4] = "SRH";
		teams2[5] = "DC";
		teams2[6] = "RR";
		teams2[7] = "KXI";

		System.out.println(searchTeam(teams1,"RCB"));
		printTeamName(teams1,20);

	}
}

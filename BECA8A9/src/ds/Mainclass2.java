package ds;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Mainclass2 
{
	public static void printTeams(String[] teams) 
	{
		Stream<String> stm = Arrays.stream(teams);//create a stream and return addrs
	    
//Consumer<String> ref = (String str)-> System.out.println(str);
		//stm.forEach((String str)-> System.out.println(str));
		stm.forEach( str -> System.out.println(str));
	    
		Arrays.stream(teams)
		      .forEach(str2 -> System.out.println(str2));
		
		//.forEach(varName -> stmt);
	}

	public static void printTeamName(String[] teams, int index) 
	{
		
	}
	public static boolean searchTeam(String[] teams,String team)
	{
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

		printTeams(teams1);
	}
}

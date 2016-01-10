package temp;

import java.io.*;
import java.net.*;

public class Temp 
{
	public Temp()
	{
		System.out.println("Temp class has started!");
		
		//get URL
		
		try 
		{
			URL apiLink = new URL("http://www.omdbapi.com/?t=big+hero+6&y=&plot=short&r=xml");
			URLConnection apiConnection = apiLink.openConnection();
			apiConnection.connect();
			String output = "";
			System.out.println(output);
			BufferedReader br = new BufferedReader( new InputStreamReader(apiConnection.getInputStream()));
			output = br.readLine();
			System.out.println(output);
		} 
		
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

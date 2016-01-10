package temp;

import java.util.ArrayList;
import java.util.Random;

public class ObjectCreator {
	
	static ArrayList<String> myArray = new ArrayList<>();
	static Random rand = new Random();

	public static void main(String[] args) {
		makeObs();

	}
	
	public static void makeObs()
	{
		int i = 0;
		while (i<=10)
		{
			String myString = Integer.valueOf(rand.nextInt(50)).toString();
			myArray.add(myString);
			i++;
		}
		
		i = 0;
		
		for (String string: myArray)
		{
			System.out.println(string);
		}
	}

}

package halloween_party;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HalloweenParty 
{
	public static void chocolates(double cuts) 
	{
		DecimalFormat df = new DecimalFormat("###.#");
		if(cuts%2 == 0)
		{
			double peices = cuts/2;
			double peicesLeft = cuts - peices;
			double answer = peicesLeft * peices;
			System.out.println(df.format(answer));
		}
		else
		{
			double peices = (cuts+1)/2;
			double peicesLeft = cuts - peices;
			double answer = peicesLeft * peices;
			System.out.println(df.format(answer));
		}
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int count = Integer.parseInt(sr.nextLine());
		double cuts[] = new double[count];
		for(int i = 0; i < count; i++)
		{
			cuts[i] = Integer.parseInt(sr.nextLine());
		}
		for(int i = 0; i < count; i++)
		{
			chocolates(cuts[i]);
		}
		sr.close();
	}
}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class copy
{
	public static void main(String[] args)
	{
		try
		{
			FileReader infile = new FileReader(args[0]);
			Scanner in = new Scanner(infile);
			FileWriter outfile = new FileWriter(args[1]);

			while(in.hasNextLine())
			{
				String s = in.nextLine() + "\n";
			         outfile.write(s);
			}
		
			outfile.close();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
// add comments

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader(args[1]);
			Scanner in = new Scanner(fr);
			FileWriter fw = new FileWriter(args[2]);

			while(in.hasNextLine())
			{
				String s = in.nextLine() + "\n";
				fw.write(s);
			}
		
			fw.close();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

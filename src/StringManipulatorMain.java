import java.util.Scanner;
public class StringManipulatorMain 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		StringManipulator strIn = new StringManipulator();
		System.out.println("Would you like to use noVowels or reverse: ");
		String method = strIn.in;
		Scanner stringIn = new Scanner(System.in);
		System.out.println("Input your string: ");
		String string = StrManip.nextLine();

		if (method == "noVowels")
		{
			System.out.println(StrManip.noVowels(string));
		}
		
	}
}

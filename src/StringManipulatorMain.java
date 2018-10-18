import java.util.Scanner;
public class StringManipulatorMain 
{
	public static void main(String[] args)
	{
		Scanner StrManip = new Scanner(System.in);
		StringManipulator strIn = new StringManipulator();
		System.out.println("Would you like to use noVowels or reverse: ");
		String method = StrManip.nextLine();
		Scanner stringIn = new Scanner(System.in);
		System.out.println("Input your string: ");
		String string = StrManip.nextLine();

		if (method == "noVowels")
		{
			strIn.noVowels(string);
		}
		return strIn;
	}
}

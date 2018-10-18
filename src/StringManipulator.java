
/**
 * @author Matthew To
 *
 */
public class StringManipulator 
{
	public String noVowels(String str)
	{  
		String noVowels = "";
	    for (int i = 0; i < str.length(); i++) 
	    {  
	    	 char c = str.charAt(i);
	         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
	         {
	        	 noVowels += "*";
	         }
	         else
	         {
	        	 noVowels += str.charAt(i);
	         }
	    }  
	    return noVowels;
	}  
	public String reverse(String str)
	{
		String strR = "";
		int len = strR.length();
		for (int i=len-1;i>=0;i--) 
        {
            strR = strR + strR.charAt(i);
        }
		return strR;
	}
}




/**
 * @author Matthew To
 *
 */
public class StringManipulator 
{
	String str = "";
	public String noVowels()
	{  
	    for (int i = 0; i < str.length(); i++) 
	    {  
	    	 char c = noVowels().charAt(i);
	         if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
	         {
	        	 String front = str.substring(0, i);
	             String back = str.substring(i + 1);
	             str = front + "*" + back;
	         }
	           return str;
	    }  
	       
	}  
	public String reverse()
	{
		String reverseStr = "";
		int len = reverseStr.length();
		for (int i=len-1;i>=0;i--) 
        {
            reverseStr = reverseStr + reverseStr.charAt(i);
        }
		return reverseStr;
	}
}



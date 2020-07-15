/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        System.out.println("ABC"); 
        System.out.println(Remove("ABC"));
        System.out.println("AABC"); 
        System.out.println(Remove("AABC"));
        System.out.println("BAC"); 
        System.out.println(Remove("BAC"));
        System.out.println("BAAC"); 
        System.out.println(Remove("BAAC"));
	}
	 static String Remove(String string) {
		String result=string;
		int n=string.length();
		if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
			
			result= ""+string.substring(1,n);
		}
		else if(string.charAt(0)=='A'&&string.charAt(1)=='A') 
		{
			result=""+string.substring(2,n) ;
		}
		if(string.charAt(0)!='A'&&string.charAt(1)=='A')
		{
			
			result= string.charAt(0)+string.substring(2,n);
		}
		
		return result;
	}
}

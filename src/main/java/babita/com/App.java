package babita.com;
import java.util.*;
import java.io.*;
import java.lang.*;
public class App
{   
	public static void main(String[] args)
    	{
       		App obj=new App();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		System.out.println("New String="+obj.Rem(sc.next()));
	}
	
	public String Rem(String S)
	{
		if(S.length()==0)
		{
			return(S);
		}
		else if(S.length()==1)
		{
			if(S.charAt(0)=='A')
			{
				return("");
			}
			else
			{
				return(S);
			}
		}
		else
		{
			if(S.charAt(0)=='A' && S.charAt(1)=='A')
			{
				return(S.substring(2));
			}
			else if(S.charAt(0)=='A')
			{
				return(S.substring(1));
			}
			else if(S.charAt(1)=='A')
			{
				return(S.charAt(0)+S.substring(2));
			}
			else
			{
				return(S);
			}
		}
	}
}

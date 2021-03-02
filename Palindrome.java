package devOps;
import java.util.Scanner;
import java.io.*;

public class Palindrome {

	public static void main(String[] args)
	{
		String palindromeTest, reverse="";
		boolean pal=true;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the word you want to find is a palindrome");
		palindromeTest= input.next();
	
	for(int i =palindromeTest.length()-1; i>=0; i--)
	{
		reverse=reverse+palindromeTest.charAt(i);

	}
	for(int i =0; i<palindromeTest.length(); i++)
	if(reverse.charAt(i)!=palindromeTest.charAt(i))
		{
		pal=false;
		break;
		}
	
		System.out.print(pal);
	}
}

package devOps;
import java.util.Scanner;
import java.io.*;

public class Consonants {

	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your text");
		String words=input.nextLine();
		int count=0;
		char[] test= new char[words.length()];
		for(int i=0; i<words.length(); i++)
		{
		if(words.charAt(i)=='A'||words.charAt(i)=='E'||words.charAt(i)=='I'||words.charAt(i)=='O'||words.charAt(i)=='U'||
			words.charAt(i)==' '||words.charAt(i)=='a'||words.charAt(i)=='e'||words.charAt(i)=='i'||words.charAt(i)=='o'||words.charAt(i)=='u')
				{
				count++;
				test[i]=words.charAt(i);
				}
		else
		{
			test[i]='*';
		}
		}
	System.out.println("Total consonants = "+ (words.length()-count));
	System.out.println(test);
		
		
	}
}

package devOps;
import java.util.Scanner;
import java.io.*;


public class words {

	public static void main(String[] args)
	{
		int wordNum=1;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String wordCount=input.nextLine();
		for(int i=0; i<wordCount.length();i++)
		{
			if(wordCount.charAt(i)==' ')
				wordNum++;
		}
		System.out.println("Your sentence has "+wordNum+" words");
	}
}

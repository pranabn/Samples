package devOps;
import java.util.Scanner;

public class lastLetterCount {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int countx=0, county=0, wordCount=1;
		System.out.println("Enter your text");
		String lastLetter=input.nextLine();
		char[] letters= new char[lastLetter.length()];
		letters[0]=lastLetter.charAt(0);
		for(int i=1; i<lastLetter.length(); i++)
		{
			letters[i]=lastLetter.charAt(i);
			if(letters[i]==' ')
				wordCount++;
			if(letters[i]==' '& letters[i-1]=='x')
				countx++;
			if(letters[i]==' '& letters[i-1]=='y')
				county++;
		}
		if(letters[lastLetter.length()-1]=='x')
			countx++;
		if(letters[lastLetter.length()-1]=='y')
			county++;
	System.out.println("Number of x:"+ countx +" Number of y:"+county+" total words = "+wordCount);	
		
	}

}

package devOps;

import java.io.*;
public class vowels {

	public static void main(String[] args){
	String apple="Hey, lets test this and see what's up";
	int count = 0;
	for(int i = 0; i< apple.length(); i++)
	{
	if(apple.charAt(i)=='A'||apple.charAt(i)=='E'||apple.charAt(i)=='I'||apple.charAt(i)=='O'||apple.charAt(i)=='U'||
	apple.charAt(i)=='a'||apple.charAt(i)=='e'||apple.charAt(i)=='i'||apple.charAt(i)=='o'||apple.charAt(i)=='u')
	{
	count++;
	}

	}
	System.out.println(count);
	}

}

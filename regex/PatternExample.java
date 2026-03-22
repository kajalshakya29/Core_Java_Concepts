package com.journaldev.util;
import java.util.regex.*;
public class PatternExample
{
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = Pattern.matcher("MxxY");
		System.out.println("Input String Matches regex- " + matches.matcher());
		// bad reular expression
		pattern = Pattern.compile("*xx*");
	}
}
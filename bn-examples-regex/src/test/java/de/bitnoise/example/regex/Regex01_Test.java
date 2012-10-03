package de.bitnoise.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Regex01_Test {
	
	@Test
	public void sampleRegEx() {
		Pattern pattern = Pattern.compile("l");
		Matcher matcher = pattern.matcher("Hello World of RegEx!");

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}

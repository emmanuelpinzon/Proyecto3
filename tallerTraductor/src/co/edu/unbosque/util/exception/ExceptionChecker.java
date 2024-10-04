package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {

	public static void checkWord(String word) throws InvalidWordException {
		if (word == null || word.trim().isEmpty()) {
			throw new InvalidWordException();
		}

		Pattern p = Pattern.compile("[^a-zA-Z ]");
		Matcher m = p.matcher(word);

		if (m.find()) {
			throw new InvalidWordException();
		}
	}
}

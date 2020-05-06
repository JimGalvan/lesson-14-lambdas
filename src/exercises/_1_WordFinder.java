package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import examples.Boy;

public class _1_WordFinder {

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */
		
		System.out.println(loadWordList());
		
	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");
		Stream<String> streamOfWords = messages.stream();


		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				 messages.add(aLine);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<String> filteredWords = streamOfWords
				.filter(String -> String.startsWith("P"))
				.filter(String -> isOver10WordsLong(String))
				.collect(Collectors.toList());

		return filteredWords;
	}
	
	static boolean isOver10WordsLong(String word) {
		
		if (word.length() > 10)
		return true;
		else return false;
		
	}

}

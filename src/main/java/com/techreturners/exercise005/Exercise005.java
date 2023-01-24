package com.techreturners.exercise005;

import java.util.Set;
import java.util.stream.Collectors;

public class Exercise005 {

	private static final int numberOfAlphabets = 26;

	public boolean isPangram(final String input) {

		final Set<Character> charecterSet = input.toLowerCase().chars().mapToObj(alphabet -> (char) alphabet)
				.filter(alphabet -> alphabet >= 'a' && alphabet <= 'z').collect(Collectors.toSet());
		return charecterSet.size() == numberOfAlphabets;
	}

}

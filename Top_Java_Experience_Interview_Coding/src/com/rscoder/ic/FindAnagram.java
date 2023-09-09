package com.rscoder.ic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.
public class FindAnagram {

	public static void main(String[] args) {
		String words[] = { "rat", "tar", "cat", "tac", "act" };
		Map<String, List<String>> anagramGroups = new HashMap<>();
		for (String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);// sort the array
			String sortedWord = new String(charArray);
			if (!anagramGroups.containsKey(sortedWord)) {// check the word in map or not
				anagramGroups.put(sortedWord, new ArrayList<>());
			}
			anagramGroups.get(sortedWord).add(word);// Add the anagram in list
		}
		System.out.println(anagramGroups.values());

	}
}

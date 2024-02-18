package com.youtube.trainning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortLinkedHashMapDescending {
	public static void main(String[] args) {
		// Create a sample LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Alice", 30);
		linkedHashMap.put("Bob", 50);
		linkedHashMap.put("Charlie", 20);
		linkedHashMap.put("David", 40);

		// Convert the LinkedHashMap to a list of entries
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(linkedHashMap.entrySet());

		// Sort the list in descending order based on values
		Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

		// Create a new LinkedHashMap to store the sorted entries
		LinkedHashMap<String, Integer> sortedLinkedHashMap = new LinkedHashMap<>();

		// Add sorted entries to the new LinkedHashMap
		for (Map.Entry<String, Integer> entry : entryList) {
			sortedLinkedHashMap.put(entry.getKey(), entry.getValue());
		}

		// Print the sorted LinkedHashMap
		for (Map.Entry<String, Integer> entry : sortedLinkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}

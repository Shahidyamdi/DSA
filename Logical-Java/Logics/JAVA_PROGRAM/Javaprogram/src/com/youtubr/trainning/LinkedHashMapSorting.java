package com.youtubr.trainning;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkedHashMapSorting {
	public static void main(String[] args) {
		// Create a LinkedHashMap with some sample data
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("John", 25);
		linkedHashMap.put("Alice", 30);
		linkedHashMap.put("Bob", 20);
		linkedHashMap.put("Eve", 35);

		// Sort the LinkedHashMap by values in descending order
		LinkedHashMap<String, Integer> sortedMap = linkedHashMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		// Display the sorted LinkedHashMap
		sortedMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}

package interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		String namesArray[] = {"Craig", "Casey","Michael", "John", "Carl", "Joey", "Michael"};
		//1 nested for loop
		for(int i = 0; i < namesArray.length; i++) {
			for(int j = i+1; j < namesArray.length; j++) {
				if(namesArray[i].equals(namesArray[j])) {
					System.out.println("Duplicate is: " + namesArray[j]);
				}
			}
		}
		//2 hashset
		Set<String> namesSet = new HashSet<String>();
		for(String name : namesArray) {
			if(namesSet.add(name) == false) {
				System.out.println("\nDuplicate is: " + name);
			}
		}

		//3 hashmap
		Map<String, Integer> namesMap = new HashMap<String, Integer>();
		for(String name : namesArray) {
			Integer count = namesMap.get(name);
			if(count == null) {
				namesMap.put(name, 1);
			}
			else {
				namesMap.put(name, 2);
			}
		}
		Set<Entry<String, Integer>> namesEntry = namesMap.entrySet();
		for(Entry<String, Integer> entry : namesEntry) {
			if(entry.getValue() > 1) {
				System.out.println("\nDuplicate is: " + entry.getKey());
			}
		}
	}

}

package week4StringBuliderListSetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringBuilderListSetMap {
	
	public static void main(String[] args) {
		
		//why would we use a StringBuilder instead of a String?
		// Using StringBuilder would be a better option instead of a String when you need to re-use a lot of code. Instead of rewriting the same code 
		// over and over again, you can use StringBuilders which are mutable and reusable, it provides better performance and allocates buffer space in the memory. 
		
		//instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
		//make sure no dash appears at the end of the StringBuilder
		StringBuilder numbers = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if (i != 9) {
				numbers.append(i + "-");
			} else {
				numbers.append(i);
			}
			}
			System.out.println(numbers.toString());
			System.out.println("---------------");
		
		//create a list of Strings and add 5 Strings to it, each with a different length
		
			List<String> product = new ArrayList<String>();

			product.add("Cheese");
			product.add("Bacon");
			product.add("Eggs");
			product.add("Salad");
			product.add("Milk");
			
		//write and test a method that takes a list of strings and returns the shortest string
		
		System.out.println(shortestString(product));
		System.out.println("----------------------------");
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
		List<String> swapped = swap(product);
		for (String string : swapped) {
			System.out.println(string);
		}
			System.out.println("--------------------------------");
	
	
		//write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
		//separated by a comma
	
System.out.println(combineStrings(swapped));

	
		//write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list
		//containing the second string parameter (i.e. like a search method)
System.out.println("---------------------");
		List<String> searchResults = search(product, "a");
		for (String result : searchResults) {
			System.out.println(result);
		}
		//write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		//by 3, the third divisible by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> numbers1 = Arrays.asList(3, 65, 4, 66, 100, 5, 16, 24, 74, 48);
		List<List<Integer>> sortedNumbers1 = sortDivisibleNumbers(numbers1);
		
		for (List<Integer> list : sortedNumbers1) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next list------");
			}
		
	
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		List<Integer> strings = stringLengths(product);
		for (Integer i : strings) {
			System.out.println(i);
		}
		//create a set of strings and add 5 values
		Set<String> object = new HashSet<String>();
		object.add("Skateboard");
		object.add("Guitar");
		object.add("PlayStation");
		object.add("Paint brush");
		object.add("Bike");
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
		//input set that start with the character parameter.
		Set<String> startsWithB = startsWith(object, 'B');
		for(String word : startsWithB) {
			System.out.println(word);
		}
		//write and test a method that takes a set of strings and returns a list of the same strings
		List<String> resultList = setToList(object);
		for(String listString: resultList) {
		System.out.println(listString);
		}
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		Set<Integer> integer = new HashSet<Integer>();
		integer.add(96);
		integer.add(45);
		integer.add(32);
		integer.add(112);
		integer.add(77);
		integer.add(33);
		integer.add(2);
		integer.add(1000000);
		integer.add(314);
		System.out.println("--Even Numbers--");
		Set<Integer> evenNumbers = evenNumbers(integer);
		for (Integer number : evenNumbers) {
		System.out.println(number);
		}
		//create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		Map<String, String> definitions = new HashMap<String, String>();
		definitions.put("Abundance:", " a very large quantity of something.");
		definitions.put("Articulate:", " having or showing the ability to speak fluently and coherently");
		definitions.put("Adequate:", " satisfactory or acceptable in quality or quantity");
		//write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches the 
		//string parameter (i.e. like a language dictionary lookup)
		String value = lookUpValue(definitions, "Adequate:");
		System.out.println(value);
		//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
		//with a given character
		Map<Character, Integer> counts =countStartingLetters(resultList);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}
	}
	
	
public static String shortestString(List<String> list) {
	String shortest = list.get(0);
	for (String product : list) {
		if (product.length() < shortest.length()) {
			shortest = product;	
	}
}
return shortest;
}
public static List<String> swap(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
}

public static String combineStrings(List<String> product) {
	StringBuilder result = new StringBuilder();
	for (String list : product) {
		result.append(list + " , ");
	}
	return result.toString();
}

public static List<String> search(List<String> list, String query) {
List<String> results = new ArrayList<String>();
for (String string : list) {
if (string.contains(query)) {
	results.add(string);
}
}
return results;
}
public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
	List<List<Integer>> results = new ArrayList<List<Integer>>();
results.add(new ArrayList<Integer>());
results.add(new ArrayList<Integer>());
results.add(new ArrayList<Integer>());
results.add(new ArrayList<Integer>());

	for (Integer number : list) {
	if (number % 2 == 0) {
		results.get(0).add(number);
	}
	if (number % 3 == 0) {
		results.get(1).add(number); 
	}
		if (number % 5 == 0) {
			results.get(2).add(number);
	}
	if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
		results.get(3).add(number);
	
	}
}
return results;
	}
public static List<Integer> stringLengths(List<String> list) {
	List<Integer> lengths = new ArrayList<Integer>();
	for (String string : list) {
		lengths.add(string.length());
	}
	return lengths;
}
 public static Set<String> startsWith(Set<String> object, char b) {
	 Set<String> results = new HashSet<String>();
	 
	 for (String string : object) {
		 if (string.charAt(0) == b) {
			 results.add(string);
		 }
	 }
	return results;
 }
public static List<String> setToList(Set<String> object) {
	List<String> results = new ArrayList<String>();
	
	for (String string : object) {
		results.add(string);
	}
	return results;
}
public static Set <Integer> evenNumbers(Set<Integer> set) {
Set<Integer> results = new HashSet<Integer>();
for (Integer number : set) {
	if (number % 2 == 0) {
		results.add(number);
	}
}
return results;
}
public static String lookUpValue(Map<String, String> map, String string) {
	for (String key : map.keySet()) {
		if (key.equals(string)) {
			return map.get(key);
		}
	}
	return string;
}
public static Map<Character, Integer> countStartingLetters(List<String> list) {
	Map<Character, Integer> results = new HashMap<Character, Integer>();
	
	for (String string : list) {
		char c = string.charAt(0);
		if (results.get(c) == null) {
			results.put(c,1);
		} else {
			results.put(c, results.get(c) + 1);
		}
	}
	return results;
}

}


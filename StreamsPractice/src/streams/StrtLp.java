package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StrtLp {

	public static void main(String[] args) {

		/*
		 * List<String> list1=new ArrayList<String>(); list1.add("apple");
		 * list1.add("banana"); list1.add("abble"); list1.add("plum");
		 */

		List<String> list1 = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "agency", "abc");

		List newlist = list1.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
		for (String name : list1) {
			System.out.println("Names starts with a" + newlist);

		}

	}

}

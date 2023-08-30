package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Dup {
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1, 1, 2, 3, 3, 3, 5, 4, 6, 7, 7, 8, 9, 10);
		System.out.println(ar);
		List<Integer> duplicates = ar.stream().filter(x -> Collections.frequency(ar, x) > 1)
				.collect(Collectors.toList());
		System.out.println(duplicates);

	}
}

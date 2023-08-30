package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenForEach {
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int newar : ar) {
			if (newar % 2 == 0) {
				System.out.println(newar);
			}

		}
	}
}

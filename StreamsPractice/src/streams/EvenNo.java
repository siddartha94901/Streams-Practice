package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		System.out.println("Even numbers:");
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
		System.out.println("\nOdd numbers:");
		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
	}
}

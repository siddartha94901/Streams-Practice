package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Start1 {
public static void main(String[] args) {
		
		
		List<Integer> list1=Arrays.asList(10,11,20,14,44,56);
		
		
		List newlist=list1.stream()
				.map(s->s +" ")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(newlist);
}}

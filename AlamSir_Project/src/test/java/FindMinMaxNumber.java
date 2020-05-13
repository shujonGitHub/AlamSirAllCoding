
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMinMaxNumber {

	public static void main(String[] args) {
		// How to find minimum number & maximum number ?
		// How to reverse String?

		List<Integer> num = new ArrayList<>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		// How to print out all numbers
		System.out.println("My numbers are :" + num);

		// how to print out by count number
		System.out.println(num.size());

		// How to do advance loop for print all the value
		for (Integer list : num) {
			System.out.println(list);
		}

		// How to find maximum value
		int max = Collections.max(num);
		System.out.println("Max value ::" + max);

		// How to find the minimum value
		int min = Collections.min(num);
		System.out.println("Min value ::" + min);
		

		System.out.println("Before reverse :" + num);
		
		
		Collections.reverse(num);
		System.out.println("After reversr :" + num);

		// Set can't handle duplicate value
		Set<Integer> value = new HashSet<>();

		value.add(25);
		value.add(35);
		value.add(45);
		value.add(55);
		value.add(65);
		value.add(65);

		System.out.println("This is a set value :" + value);

	}

	public static void arrayDemo() {

		int numc[] = { 20, 50, 90, 110, 150 };

		System.out.println(numc);

	}
}

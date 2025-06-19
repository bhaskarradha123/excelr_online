package java_8_features;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);

		long count = list.stream().filter((a) -> a % 3 == 0).count();
		System.out.println(count);
	}
}

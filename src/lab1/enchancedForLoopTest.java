package lab1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class enchancedForLoopTest {
	public static void main(String args[]) {
		Consumer<List<Integer>> printList = (List<Integer> b) -> {
			b.forEach(System.out::println);
		};
		printList.accept(Arrays.asList(4, 1, 122, 3));
	}

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

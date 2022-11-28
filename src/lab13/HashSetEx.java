package lab13;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Harsh");
		set.add("World");
		set.add("Car");
		set.add("Hi");
		System.out.println(set);
		set.remove("Hi");
		System.out.println(set);
		HashSet<String> tempSet = new HashSet<String>();
		tempSet.add("temp1");
		tempSet.add("temp2");
		set.addAll(tempSet);
		System.out.println(set);
		set.removeAll(tempSet);
		System.out.println(set);
		set.removeIf(str -> str.equals("Harsh"));
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

}

package lab13;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		for(int i = 0;i<=6;i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
		System.out.println(list);
		list.remove(1);
		list.remove((Integer) (5));
		System.out.println(list.size());
		System.out.println(list);
	}

}

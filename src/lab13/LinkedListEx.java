package lab13;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1,4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		list.remove(3);
		list.remove((Integer) (5));
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		list.set(2, 39);
		System.out.println(list);
	}

}

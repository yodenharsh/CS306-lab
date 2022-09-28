package lab3;

import java.util.Objects;

public class ConstructorExample {
	public static void main(String args[]) {
		Example obj = new Example();
		Example obj2 = new Example(43, "Harsh");
		System.out.println(obj.getStatus());
		System.out.println(obj2.getStatus());
	}
}

class Example {
	private Integer id = null;
	private String name = null;

	Example(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Example() {
	}

	public String getStatus() {
		if (Objects.isNull(id) && Objects.isNull(name))
			return "Not set";
		else
			return "Set";
	}
}

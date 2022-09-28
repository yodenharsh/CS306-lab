package lab6;

//Q1. Write a Java program to demonstrate the use of super keyword with methods

public class SuperMeth {
	public static void main(String[] args) {
		var uni = new Woxsen();
		uni.showStudents();
	}
}

class Woxsen extends University{

	Woxsen(){
		super.studentsNumber();
	}
	void studentsNumber() {
		System.out.println("Total students in Woxsen are 2500");
		super.studentsNumber();
	}
	void showStudents() {
		studentsNumber();
	}
}

class University {
	void studentsNumber() {
		System.out.println("Total students in all universities are too many to count!");
	}
}
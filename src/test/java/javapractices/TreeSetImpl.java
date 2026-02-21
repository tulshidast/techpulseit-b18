package javapractices;

import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<>();

		s.add(40);
		s.add(50);
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(30);
		// s.add(null);

		for (Integer i : s) {
			System.out.println(i);
		}

		System.out.println("#################################################");

		TreeSet<String> names = new TreeSet<String>();
		names.add("virat");
		names.add("sachin");
		names.add("hardik");
		names.add("rahul");
		names.add("verendra");

		for (String i : names) {
			System.out.println(i);
		}

		TreeSet<Student> students = new TreeSet<Student>();
		students.add(new Student("Sachin", 1, 'A'));
		students.add(new Student("Virat", 5, 'A'));
		students.add(new Student("Hardik", 2, 'B'));
		students.add(new Student("Rahul", 3, 'C'));

		for (Student i : students) {
			i.display();
		}

	}

}

class Student implements Comparable {

	String name;
	float age;
	char div;

	Student(String name, float age, char div) {
		this.name = name;
		this.age = age;
		this.div = div;
	}

	public void display() {
		System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "div = " + div);
	}

	@Override
	public int compareTo(Object other) {
		return this.name.compareTo(((Student) other).name);
	}

}

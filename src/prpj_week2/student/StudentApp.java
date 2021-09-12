package prpj_week2.student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp implements Comparable<StudentApp> {
	int no;			// number
	String name;	// name
	int age;		// age
	
	public StudentApp(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(StudentApp o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "Student [no=" + this.no + ", name=" + this.name +  ", age=" + this.age + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<StudentApp> student = new ArrayList<StudentApp>();
		student.add(new StudentApp(1, "Kim", 35));
		student.add(new StudentApp(2, "Lee", 20));
		student.add(new StudentApp(3, "Park", 50));
		student.add(new StudentApp(4, "Choe", 30));
		student.add(new StudentApp(5, "Seong", 45));
		student.add(new StudentApp(6, "Han", 35));
		student.add(new StudentApp(7, "Hong", 30));
		student.add(new StudentApp(8, "Ryu", 35));
		student.add(new StudentApp(9, "Kang", 50));
		student.add(new StudentApp(10, "Jeong", 25));
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(student);
		student.forEach(System.out::println);
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(student, Collections.reverseOrder());
		student.forEach(System.out::println);	
	}

}

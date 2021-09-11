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
		student.add(new StudentApp(1, "Kim", 3500));
		student.add(new StudentApp(2, "Lee", 2000));
		student.add(new StudentApp(3, "Park", 5000));
		student.add(new StudentApp(4, "Choe", 3000));
		student.add(new StudentApp(5, "Seong", 4500));
		student.add(new StudentApp(6, "Han", 3500));
		student.add(new StudentApp(7, "Hong", 3000));
		student.add(new StudentApp(8, "Ryu", 3500));
		student.add(new StudentApp(9, "Kang", 5000));
		student.add(new StudentApp(10, "Jeong", 2500));
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(student);
		student.forEach(System.out::println);
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(student, Collections.reverseOrder());
		student.forEach(System.out::println);	
	}

}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "Ricky"), new Student(15, "Julian"), new Student(3, "Lahey"));
		List<Student> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);

		// prints out list of students with their id's
		System.out.println(studentsAl);
	}

}

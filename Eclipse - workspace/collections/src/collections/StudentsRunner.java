package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentsRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "Ricky"), new Student(15, "Julian"), new Student(3, "Lahey"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);

		Collections.sort(studentsAl);

		// prints out list of students with their id's
		System.out.println("Dsc" + studentsAl);

		// Collections.sort(studentsAl, new DescendingStudentComparator());
		// System.out.println("AscendingStudentComparator" + studentsAl);

		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentsAl);
	}

}
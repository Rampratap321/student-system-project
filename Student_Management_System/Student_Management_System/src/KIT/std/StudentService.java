package KIT.std;

import java.util.List;
import java.util.ArrayList;

public class StudentService {
	private final List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Students add successfully");
	}

	public void viewStudent() {
		if (students.isEmpty()) {
			System.out.println("No students to display");
		} else {
			students.forEach(System.out::println);
		}

	}

	public void updateStudent(int id, String newName, String newCourse) {
		for (Student student : students) {
			if (student.getId() == id) {
				student.setName(newName);
				student.setCourse(newCourse);
				System.out.println("Student Updated.");
				return;
			}
		}
		System.out.println("Student not found");
	}

	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
		System.out.println("Student Deleted (if existed).");
	}
}

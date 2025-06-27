package KIT.std;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		try (Scanner scanner = new Scanner(System.in)) {
			int choice;
			do {
				System.out.println("\n---Student Management System---");
				System.out.println("1. Add Student");
				System.out.println("2. View Student");
				System.out.println("3. Update Student");
				System.out.println("4. Delete Student");
				System.out.println("5. Exit");
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1 -> {
					System.out.println("Enter ID");//
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter Name");
					String name = scanner.nextLine();
					System.out.println("Enter Course");
					String course = scanner.nextLine();
					service.addStudent(new Student(id, name, course));
				}
				case 2 -> service.viewStudent();
				case 3 -> {
					System.out.println("Enter ID to Update: ");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter New Name");
					String newName = scanner.nextLine();
					System.out.println("Enter New Course");
					String newCourse = scanner.nextLine();
					service.updateStudent(id, newName, newCourse);
				}
				case 4 -> {
					System.out.println("Enter ID to delete");
					int id = scanner.nextInt();
					service.deleteStudent(id);
				}
				case 0 -> System.out.println("Exiting...");
				default -> System.out.println("Invalid Choicee");
				}
			} while (choice != 0);
		}
	}
}
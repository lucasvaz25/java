package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter with the Name and Notes: ");
		student.name = sc.nextLine();
		student.firstNote = sc.nextDouble();
		student.secondNote = sc.nextDouble();
		student.thirdNote = sc.nextDouble();
		student.Final = student.SumNote();
		student.PassOrFailed();

		sc.close();
	}

}

package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do aluno: ");
		System.out.print("Name ");
		String name = sc.nextLine();

		System.out.print("Nota 1 (0 <= n1 <= 30): ");
		Double n1 = sc.nextDouble();
		while (n1 > 30.0 || n1 < 0.0) {
			System.out.println("Nota invalida.");
			System.out.print("Nota 1 (0 <= n1 <= 30): ");
			n1 = sc.nextDouble();
		}

		System.out.print("Nota 2 (0 <= n1 <= 35): ");
		Double n2 = sc.nextDouble();
		while (n2 < 0.0 || n2 > 35.0) {
			System.out.println("Nota invalida.");
			System.out.print("Nota 1 (0 <= n1 <= 35): ");
			n2 = sc.nextDouble();
		}
		

		System.out.print("Nota 3 (0 <= n1 <= 35): ");
		Double n3 = sc.nextDouble();
		while (n3 < 0.0 || n3 > 35.0) {
			System.out.println("Nota invalida.");
			System.out.print("Nota 1 (0 <= n1 <= 35): ");
			n3 = sc.nextDouble();
		}

		Student aluno = new Student(name, n1, n2, n3);

		aluno.finalGrade();

		sc.close();
	}

}

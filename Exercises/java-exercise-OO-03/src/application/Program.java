package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome: ");
        student.nome = scan.nextLine();
        System.out.print("First grade: ");
        student.nota1 = scan.nextDouble();
        System.out.print("Second grade: ");
        student.nota2 = scan.nextDouble();
        System.out.print("Third grade: ");
        student.nota3 = scan.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }else {
            System.out.println("PASS");
        }
    }
}

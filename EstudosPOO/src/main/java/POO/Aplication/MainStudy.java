package POO.Aplication;

import POO.entidades.Student;

import java.util.Locale;
import java.util.Scanner;

public class MainStudy {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Student estudante = new Student();
        System.out.println("Name: ");
        estudante.nome = sc.nextLine();

        System.out.println("Nota 1: ");
        estudante.n1 = sc.nextDouble();

        System.out.println("Nota 2:");
        estudante.n2 = sc.nextDouble();

        System.out.println("Nota 3:");
        estudante.n3 = sc.nextDouble();

        double finalGrade = estudante.finalGrade();

        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);

        if (estudante.isApproved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoints());
        }
    }
}

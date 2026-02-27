package POO.AplicationSemPOO;

import java.util.Locale;
import java.util.Scanner;

public class StudentSemPoo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double primeiroSemestre = sc.nextDouble();
        double segundoSemestre = sc.nextDouble();
        double terceiroSemestre = sc.nextDouble();

        double notas = primeiroSemestre + segundoSemestre + terceiroSemestre;
        if (notas >= 60){
            System.out.printf("FINAL GRADE = %.2f%n",notas);
            System.out.println("PASS");
        }else{
            System.out.printf("FINAL GRADE = %.2f%n",notas);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",   60-notas);
        }

    }
}

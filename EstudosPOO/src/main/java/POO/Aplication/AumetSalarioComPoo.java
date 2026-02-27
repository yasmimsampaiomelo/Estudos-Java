package POO.Aplication;

import POO.entidades.Employee;

import java.util.Locale;
import java.util.Scanner;

public class AumetSalarioComPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.println("Name: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.printf("Employee: " + funcionario);
        System.out.println();

        System.out.println("Which percentage to increase salary?");
        double porcem= sc.nextDouble();
        funcionario.aumentoSalario(porcem);

        System.out.println("Updated data: " + funcionario);


    }
}

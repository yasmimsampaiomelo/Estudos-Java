package POO.AplicationSemPOO;

import java.util.Locale;
import java.util.Scanner;

public class AumentSalarSemPoo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        double imposto = sc.nextDouble();

        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("Employee: %s, $ %.2f%n", nome,salarioLiquido );
        System.out.println("Which percentage to increase salary?");

        double porcentagem = sc.nextDouble();
        double salarioComAumento = salarioBruto * porcentagem / 100;
        double salarioFinal = (salarioComAumento + salarioBruto)- imposto;
        System.out.printf("Updated data: %s, $ %.2f", nome, salarioFinal);

      }
}

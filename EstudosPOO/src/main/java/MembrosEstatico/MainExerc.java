package MembrosEstatico;

import MembrosEstatico.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MainExerc {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("How many dollars wi0ll be bought?" );
        double dolar = sc.nextDouble();
        System.out.println("Amount to be paid in reais : ");
        double resultado = CurrencyConverter.calcularConversao(cotacaoDolar,dolar);
        System.out.printf("%.2f%n", resultado);
    }
}

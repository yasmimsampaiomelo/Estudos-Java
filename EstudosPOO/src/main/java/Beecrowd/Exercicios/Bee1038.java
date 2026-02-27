package Beecrowd.Exercicios;


import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoProd = sc.nextInt();
        int qtd = sc.nextInt();

        String produto;
        double valor = 0;

        switch (codigoProd) {
            case 1:
                produto = "Cachorro-quente";
                valor += 4.00;
                break;
            case 2:
                produto = "X-Salada";
                valor += 4.50;
                break;
            case 3:
                produto = "X-Bacon";
                valor += 5.00;
                break;
            case 4:
                produto = "Torrada";
                valor += 2.00;
                break;
            case 5:
                produto = "Refrigerante";
                valor += 1.50;
                break;
            default:
                produto = "inválido";
        }
        if(qtd >= 2){
            double valorTotal = valor * (double) qtd;
            System.out.printf("Total: R$ %.2f%n",valorTotal);
        }else{
            System.out.printf("Total: R$ %.2f%n",valor);
        }
    }
}

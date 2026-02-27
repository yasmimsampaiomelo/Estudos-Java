package Beecrowd.Exercicios;

import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        double mediaPonderada = (n1*2 + n2*3 + n3*4 + n4*1) / 10.0;
        System.out.printf("Media: %.1f%n",mediaPonderada);

        if(mediaPonderada >= 5 && mediaPonderada<=7){
            System.out.println("Aluno em exame");
            double notaExame = sc.nextDouble();
            double media = (notaExame + mediaPonderada)/2;
            System.out.printf("Nota do exame: %.1f%n",notaExame);
            if(media>=5){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno Reprovado");
            }
            System.out.printf("Media final: %.1f%n",media);
        }else if(mediaPonderada>=7){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

    }
}

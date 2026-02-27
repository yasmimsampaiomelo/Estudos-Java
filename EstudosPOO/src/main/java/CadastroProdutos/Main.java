package CadastroProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produtos batom, preco1, quantidade;
        batom = new Produtos();
        preco1 = new Produtos();
        quantidade= new Produtos();

        batom.nome = sc.nextLine();
        preco1.preco= sc.nextDouble();
        quantidade.qtd = sc.nextInt();


    }
}

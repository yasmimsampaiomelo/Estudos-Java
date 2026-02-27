package Beecrowd.ArrayDInamico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Bee1259 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        int qtd = sc.nextInt();
        int x = 0;
        while(x<qtd){
            x++;
            int num = sc.nextInt();
            if(num % 2 == 0){
                pares.add(num);
            }else{
                impares.add(num);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares,Collections.reverseOrder());
        for (Integer par : pares){
            System.out.println(par);
        }
        for (Integer imper: impares){
            System.out.println(imper);
        }

    }
}

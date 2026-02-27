package POO.AplicationSemPOO;

import java.util.Locale;
import java.util.Scanner;

public class RetangSemPoo {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double area = width * height;
        double perimeter = 2*width+2*height;
        double hipotenusa = (width * width)+(height*height);
        double diagonal  =Math.sqrt(hipotenusa);
        System.out.printf("AREA = %.2f%n",area);
        System.out.printf("PERIMETER = %.2f%n",perimeter);
        System.out.printf("DIAGONAL = %.2f%n",diagonal);

    }
}

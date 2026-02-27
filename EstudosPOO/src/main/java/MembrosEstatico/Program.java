package MembrosEstatico;

// versao 2
import MembrosEstatico.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
        public static final double PI = 3.14159;
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Calculator calc = new Calculator();
            System.out.println("Enter raadius: ");
            double radius = sc.nextDouble();
            double c = calc.circumference(radius);
            double v = calc.volume(radius);

            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %.2f%n", PI);

        }
}

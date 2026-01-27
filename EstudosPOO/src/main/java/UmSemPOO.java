import java.util.Locale;
import java.util.Scanner;

public class UmSemPOO {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // triangiulo x
        System.out.println("Enter the measures of triangle X:");
        double ladoUmX = sc.nextDouble();
        double ladoDoisX = sc.nextDouble();
        double ladoTresX = sc.nextDouble();
        // triangulo y
        System.out.println("Enter the measures of triangle Y:");
        double ladoUmY = sc.nextDouble();
        double ladoDoisY = sc.nextDouble();
        double ladoTresY = sc.nextDouble();

        double px = (ladoUmX + ladoDoisX + ladoTresX)/2;
        double areax = Math.sqrt(px*(px - ladoUmX)*(px-ladoDoisX)*(px-ladoTresX));

        double py = (ladoUmY + ladoDoisY + ladoTresY)/2;
        double areay = Math.sqrt(py*(py - ladoUmY)*(py-ladoDoisY)*(py-ladoTresY));
        System.out.printf("Area de x: %f%n",areax);
        System.out.printf("Area de y: %f%n",areay);

        if(areax>areay){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }



    }
}

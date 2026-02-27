package POO.entidades;

public class Rectangle {
    public double width;
    public double height;


    public double area(){
        return width* height;
    }
    public double perimetro(){
        return 2*height + 2*width;
    }
    public double diagonal(){
        double hipotenusa = (width*width) + (height * height);
        return Math.sqrt(hipotenusa);
    }
}

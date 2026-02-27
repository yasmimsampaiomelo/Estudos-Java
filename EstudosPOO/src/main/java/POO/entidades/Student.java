package POO.entidades;

public class Student {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade() {
        return n1 + n2 + n3;
    }

    public boolean isApproved() {
        return finalGrade() >= 60;
    }

    public double missingPoints() {
        if (isApproved()) {
            return 0.0;
        }
        return 60 - finalGrade();
    }
}

package entities;

public class Student {
    public double nota1;
    public double nota2;
    public double nota3;
    public String nome;

    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        if (finalGrade() < 60){
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }
}
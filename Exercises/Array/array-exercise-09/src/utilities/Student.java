package utilities;

public class Student {
    private String name;
    private double n1, n2;

    public Student(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getName() {
        return name;
    }

    public double averageStudent(){
        return (n1 + n2) / 2;
    }
}

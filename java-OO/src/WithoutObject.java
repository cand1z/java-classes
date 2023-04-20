import java.util.Scanner;

public class WithoutObject {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

Area = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC))
p = (xA + xB + xC) / 2.0
         */

        Scanner sc = new Scanner(System.in);

        double aX, bX, cX, aY, bY, cY, p, areaX, areaY;

        System.out.println("Enter the measures of triangle X: ");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();

        p = (aX + bX + cX) / 2.0;
       areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));

        p = (aY + bY + cY) / 2.0;
        areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));

        System.out.printf("entities.Triangle X area: %.4f%n", areaX);
        System.out.printf("entities.Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
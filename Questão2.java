import java.lang.Math;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args){
    
        double distante, x1, y1, z1, x2, y2, z2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor de x1: ");
        x1 = leitor.nextDouble();
        System.out.println("Valor de y1: ");
        y1 = leitor.nextDouble();
        System.out.println("Valor de z1: ");
        z1 = leitor.nextDouble();
        System.out.println("Valor de x2: ");
        x2 = leitor.nextDouble();
        System.out.println("Valor de y2: ");
        y2 = leitor.nextDouble();
        System.out.println("Valor de z2: ");
        z2 = leitor.nextDouble();

        distante = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2-z1), 2));

        System.out.printf("A distancia é de: %f", distante);

    }

}
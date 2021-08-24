import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args){
        String quantidade; int numero;
        Scanner leitor = new Scanner (System.in);
        System.out.println("Numero: ");
        numero = leitor.nextInt();
        quantidade = Integer.toString(numero);
        System.out.printf("Tem "+quantidade.length()+" números");
    }
}
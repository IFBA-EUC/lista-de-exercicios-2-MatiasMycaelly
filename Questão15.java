import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args){

        double media, nota1, nota2, nota3;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = leitor.nextInt();
        System.out.println("Nota 2: ");
        nota2 = leitor.nextInt();
        System.out.println("Nota 3: ");
        nota3 = leitor.nextInt();
        media = (nota1+nota2+nota3)/3;

        if(media > 6){
            System.out.println("Aprovado!");
        }else if(media>=4 && media <= 6){
            System.out.println("Verificação Suplementar!");
        }else{
            System.out.println("Reprovado!");           
        }
    }
}
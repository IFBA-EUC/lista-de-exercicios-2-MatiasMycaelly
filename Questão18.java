import java.util.Scanner;

public class Questao18{
  
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        String unidade[]= {" zero ", " um ", " dois ", " três ", " quatro ", " cinco ", " seis ", " sete ", " oito ", " nove "};
        String dezena[]= {" zero ", " dez ", " vinte ", " trinta ", " quarenta ", " cinquenta ", " sessenta ", " setenta ", " oitenta ", " noventa "};
        String centena[]= {" zero ", " cem ", " duzentos ", " trezentos ", " quatrocentos ",  " quinhentos ", " seiscentos ", " setecentos ", " oitocentos ", " novecentos "};

        long valor, numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9;

        do{
            System.out.printf("Qual o valor para ser convertido: ");
            valor = leitor.nextLong();
            if(valor >= 1000000000){
                System.out.println("Só posso com numeros com 9 digitos!!");
            }

        }while(valor >= 1000000000);

        numero1 = valor/100000000;
        valor = valor-(numero1*100000000);
        numero2 = valor/10000000;
        valor = valor-(numero2*10000000);
        numero3 = valor/1000000;
        valor = valor-(numero3*1000000);
        numero4 = valor/100000;
        valor = valor-(numero4*100000);
        numero5 = valor/10000;
        valor = valor-(numero5*10000);
        numero6 = valor/1000;
        valor = valor-(numero6*1000);
        numero7 = valor/100;
        valor = valor-(numero7*100);
        numero8 = valor/10;
        valor = valor-(numero8*10);
        numero9 = valor/1;

        if(numero1 != 0 || numero2 != 0 ||  numero3 != 0){
            if(numero1 != 0){
                System.out.printf(centena[(int) numero1]);
            }
            if(numero2 != 0){
                System.out.printf(dezena[(int) numero2]);
            }
            if(numero3 != 0){
                System.out.printf(unidade[(int) numero3]);
            }
            System.out.printf("milhão");
        }
        if(numero4 != 0 || numero5 != 0 ||  numero6 != 0){
            if(numero4 != 0){
                System.out.printf(centena[(int) numero4]);
            }
            if(numero5 != 0){
                System.out.printf(dezena[(int) numero5]);
            }
            if(numero6 != 0){
                System.out.printf(unidade[(int) numero6]);
            }
            System.out.printf("mil");
        }
        if(numero7 != 0 || numero8 != 0 ||  numero9 != 0){
            if(numero7 != 0){
                System.out.printf(centena[(int) numero7]);
            }
            if(numero8 != 0){
                System.out.printf(dezena[(int) numero8]);
            }
            if(numero9 != 0){
                System.out.printf(unidade[(int) numero9]);
            }
        }      
    }  
}
import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args){      
        int i, valor1 = 0, valor2 = 0, result, quantidade = 0; 
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros: ");
        quantidade = leitor.nextInt();
        while(valor1 < 1){
            result = valor1;
            valor1 = result;
            System.out.printf(" "+result+" ");
            valor1++;
        }
        if(valor1 == 1 ){
            if(quantidade > 1){
                for (i = 1; i <= quantidade; i++){  
                    result = valor1 + valor2;                    
                    valor1 = valor2;                           
                    valor2 = result;
                            
                    System.out.printf(" "+result+" ");             
                }       
            }
        }
    }
}
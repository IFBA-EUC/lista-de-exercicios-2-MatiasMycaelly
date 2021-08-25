package GITHUB.src;

/* A SOLUÇÃO 1 É A CORRETA;
 Nesse caso, poderia se utilizar a repetição while, 
 de modo que  se uma valor que não seja -1 for digitado será mostrado
o código. E caso o -1 for digitado, o programa fechará*/

import java.util.Scanner;
public class Questao7 {
    
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in); 
        int codigo; 
         
        System.out.println("Informe o código: "); 
        codigo = teclado.nextInt(); 
        while (codigo != -1) { 
            System.out.println("Código: " + codigo); 
            System.out.println("Diga qual o código: "); 
            codigo = teclado.nextInt();
        }*/

        Scanner teclado = new Scanner(System.in); 
        int codigo;  
        do { 
            System.out.print("Informe o código: "); 
            codigo = teclado.nextInt();
            if(codigo != -1){       //correcao
                System.out.println("Código: " + codigo); 
            }
            
        } while (codigo != -1);
        teclado.close();
    }

}

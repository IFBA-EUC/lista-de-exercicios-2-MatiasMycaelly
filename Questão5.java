public class Questao5{

    public static void main(String[] args){
       
        for(int contador = 1; contador <= 10; contador ++){
            System.out.println("Tabela do numero "+contador);
            for(int contador2 = 1; contador2 <= 10; contador++){
                System.out.println(contador + " x " + contador2 + " = " + (contador2*contador));
            }
        }
    }
}
import java.util.Scanner;

public class Questao4 {
    
    public static void main(String[] args){

        String nome; int quantidade; double preco;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Produto: ");
        nome = leitor.nextLine();
        System.out.println("Quantidade: ");
        quantidade = leitor.nextInt();
        System.out.println("Preco: ");
        preco = leitor.nextDouble();

        if(quantidade >= 11 && quantidade <= 20){

            preco = preco * quantidade;
            preco = preco-(preco*10)/100;

            System.out.println("Produto: "+nome);
            System.out.println("Quantidade de produto: "+quantidade);
            System.out.println("Preço total: "+preco);

        }else if(quantidade >= 21 && quantidade <= 50){
                    
            preco = preco * quantidade;
            preco = preco-(preco*20)/100;

            System.out.println("Produto: "+nome);
            System.out.println("Quantidade de produto: "+quantidade);
            System.out.println("Preço total: "+preco);

        }else if(quantidade > 50){
                
            preco = preco * quantidade;
            preco = preco-(preco*25)/100;

            System.out.println("Produto: "+nome);
            System.out.println("Quantidade de produto: "+quantidade);
            System.out.println("Preço total: "+preco);

        }else{

            System.out.println("Produto: "+nome);
            System.out.println("Quantidade de produto: "+quantidade);
            System.out.println("Preço total: "+preco);

        }

    }
}
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, x1, x2, x3;
        int y1, y2, y3;
        int y1;

        System.out.print("Digite um número decimal com no máximo 3 digitos: ");
        x = scan.nextInt();

        y1 = x/100;     
        z1 = x % 100;
        y2 = z1 / 10;   
        y3 = z1 % 10;   

        
        x1 = y1 * 100; 
        x2 = y2 * 10;   
        x3 = y3;       

      
        String [] cent;         
        cent = new String[9];  
        cent[0] = "C";      
        cent[1] = "CC";    
        cent[2] = "CCC";    
        cent[3] = "CD";    
        cent[4] = "C";      
        cent[5] = "DC";    
        cent[6] = "DCC";   
        cent[7] = "DCCC";   
        cent[8] = "CM";    

  

        String [] dez;
        dez = new String[9];
        dez[0] = "X";       
        dez[1] = "XX";     
        dez[2] = "XXX";     
        dez[3] = "XL";      
        dez[4] = "L";      
        dez[5] = "LX";      
        dez[6] = "LXX";     
        dez[7] = "LXXX";    
        dez[8] = "XC";      


        String [] uni;
        uni = new String[9];
        uni[0] = "I";       
        uni[1] = "II";      
        uni[2] = "III";     
        uni[3] = "IV";      
        uni[4] = "V";       
        uni[5] = "VI";      
        uni[6] = "VII";     
        uni[7] = "VIII";    
        uni[8] = "IX";      

        String cr = " ";    

        switch (n1) {       
            case 100:       
                cr = cent[0];
                break;
            case 200:
                cr = cent[1];
                break;
            case 300:
                cr = cent[2];
                break;
            case 400:
                cr = cent[3];
                break;
            case 500:
                cr = cent[4];
                break;
            case 600:
                cr = cent[5];
                break;
            case 700:
                cr = cent[6];
                break;
            case 800:
                cr = cent[7];
                break;
            case 900:
                cr = cent[8];
                break;
        }
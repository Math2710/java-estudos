package classestring;
import java.util.Scanner;
public class ex1_analisador_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        System.out.println("Tamanho " + palavra.length());
        System.out.println("Primeiro caractere: " + palavra.charAt(0));
        System.out.println("Último caractere: " + palavra.charAt(palavra.length() -1));

        System.out.println("-------------------------------------");
       
        System.out.println("caracteres:");
        for(int i = 0; i < palavra.length(); i++){
            System.out.printf("Posição %d: %c\n", i, palavra.charAt(i));
        }

        System.out.println("-------------------------------------");
        
        System.out.print("Palavra ao contrario: ");
        for (int cont = palavra.length() -1; cont >= 0; cont--){
           System.out.print(palavra.charAt(cont));
        }
        sc.close();
    }
}

package classeMath;
import java.util.Scanner;
public class ex1_calculadora_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        

        System.out.print("Digite x: ");
        x = scanner.nextInt();

        System.out.print("Digite y: ");
        y = scanner.nextInt();

        int maior = Math.max(x, y);
        int menor = Math.min(x, y);

        System.out.println("------------------------------\n");

        System.out.println("Maior: " + maior + " | Menor: " + menor);
        System.out.println("Diferença absoluta: " + Math.abs(x - y));
        System.out.println("Raiz quadra do maior: " + Math.sqrt(maior));
        double raiz = Math.sqrt(maior);
        System.out.println("Arredondado para cima: " + Math.ceil(raiz));
        if (raiz >= 5) {
        System.out.println("Classificação: Raiz grande");        
        } else {
            System.out.println("Raiz pequena");
        }

        
        
        scanner.close();
    }
}

package classestring;
import java.util.Scanner;
public class ex3_comparador_strings {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira palavra: ");
        String firstWord = scanner.next();
        System.out.println("Digite a segunda palavra: ");
        String scdWord = scanner.next();
        int menorTamanho = Math.min(firstWord.length(), scdWord.length());
        int letrasIguais = 0;

        System.out.println("-------------------------------------");

        System.out.printf("Tamanho - %s: %d | %s: %d", firstWord, firstWord.length(), scdWord, scdWord.length());

        if (firstWord.length() > scdWord.length()){
            System.out.println("Maior palavra: " + firstWord);
        } else{
            System.out.println("Maior palavra: " + scdWord);
        }
        System.out.println("-------------------------------------");

        System.out.println("Comparado letra por letra: ");

        for(int i = 0; i < menorTamanho; i++){
            char letra1 = firstWord.charAt(i);
            char letra2 = scdWord.charAt(i);

            if (letra1 == letra2){
                System.out.printf("Posição %d: %c vs %c ->Iguais%n", i, letra1, letra2);
                letrasIguais ++;
            } else{
                System.out.printf("Posição %d: %c vs %c ->Diferentes%n", i, letra1, letra2);
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("Letras iguais na mesma posição: " + letrasIguais);
        scanner.close();
    }
}

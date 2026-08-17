package classestring;

public class ex2_array_caracteres {
    public static void main(String[] args) {
        String nome = new String("Matheus Westphal dos Santos");


        System.out.println("Nome completo: " + nome);
        
        char[] arrayLetra = new char[7];
        nome.getChars(0, 7, arrayLetra, 0);

        System.out.print("Primeiro nome em array: ");

        for(char charactere : arrayLetra){
            System.out.print(charactere);
        }
        System.out.println("-------------------------------------");
        
        System.out.println("Vogais encontradas");


        for(int i = 0; i < 7; i++){

            char letra = nome.charAt(i);

            if (letra == 'a' || letra == 'A') {
                System.out.println("Posição " + i + ": " + letra);
            } else if (letra == 'e' || letra == 'E') {
                System.out.println("Posição " + i + ": " + letra);
            } else if (letra == 'i' || letra == 'I') {
                System.out.println("Posição " + i + ": " + letra);
            } else if (letra == 'o' || letra == 'O') {
                System.out.println("Posição " + i + ": " + letra);
            } else if (letra == 'u' || letra == 'U') {
                System.out.println("Posição " + i + ": " + letra);
            }
        }
    }
}

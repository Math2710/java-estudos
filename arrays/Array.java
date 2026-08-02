package arrays;

public class Array {

    public static void main(String[] args) {
        double[] valores = new double[6];

        // Preencher o array:
        valores[0] = 6.0;
        valores[1] = 7.5;
        valores[2] = 8.2;
        valores[3] = 2.3;
        valores[4] = 1.5;
        valores[5] = 4.9;

        // Alterando os valores de duas posições no array:
        valores[0] = 2.3;
        valores[4] = 7.1;

        // Acessando os elementos alterados:
        System.out.println("Posição 0 alterada para: " + valores[0]);
        System.out.println("Posição 4 alterada para: " + valores[4]);

        // Mostrar todos os elementos do array:
        for (double elemento : valores) {
            System.out.println(elemento);
        }
        // Somar os elementos
    double total = 0;
    
    for (int i = 0; i < valores.length; i++) {
        total += valores[i];
    }
    
    System.out.println("O total é " + total);
    }
}
    
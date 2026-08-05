package arrays;

public class Ex3PlacarJogo {
    public static void main(String[] args) {
        String [] nomes = {"Carlos", "Ana", " Pedro", "julia", "Lucas"};
        int [] pontos = {850, 1200, 640, 980, 1100};
        int posicao = 0;
        int total = 0;
        for(String nome : nomes){
            System.out.printf("\"%-10s -> %d%n", nome, pontos[posicao]);
            total += pontos[posicao];
            posicao++;
        }
        System.out.println("----------------------");
        System.out.println("Total de pontos: " + total);
        float media = total / pontos.length;
        System.out.println("Média: " + media);

    }
}

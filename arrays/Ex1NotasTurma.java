package arrays;

public class Ex1NotasTurma{
    public static void main(String[] args) {
        double [] notas = {5.5, 7.0, 9.5, 6.0, 8.5};
        int posicao;
        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;
        System.out.println("=== NOTAS DA TURMA ===");
        for(posicao = 0; posicao < notas.length; posicao++) {
            maior = Math.max(maior, notas[posicao]);
            menor = Math.min(menor, notas[posicao]);
            soma += notas[posicao]; 
            System.out.printf("Posição %d: %.2f%n", posicao, notas[posicao]);
        }
        
        double media = soma / notas.length;
        System.out.println("-------------------------------------");
        System.out.printf("Média: %.2f%nMaior nota: %.2f%nMenor nota: %.2f", media, maior, menor);

    }
}
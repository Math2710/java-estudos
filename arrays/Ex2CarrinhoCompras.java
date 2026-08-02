package arrays;

public class Ex2CarrinhoCompras {
    public static void main(String[] args) {
        int posicao = 0;
        String[] produto = {"Arroz", "Feijão", "Macarrão", "Azeite"};
        double[] valor = {8.90, 7.50, 4.20, 35.90};
        double total = 0;
        String status;
        for(String item : produto) {
            System.out.printf("%-10s | R$ %.2f%n", item, valor[posicao]);
            posicao++;
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < valor.length; ++i){
            total += valor[i];
        }
        
       System.out.printf("Total: %.2f%n", total);

       status = (total <= 100) ? "Status: Dentro do orçamento" : "Status: Fora do orçamento";

       System.out.println(status);

    }
}

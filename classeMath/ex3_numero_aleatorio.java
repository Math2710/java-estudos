package classeMath;
public class ex3_numero_aleatorio {
    public static void main(String[] args) {
        String msg;
        int maior = 0;
        for (int i = 1; i <= 5; i++){
            int numero = (int) (Math.random() * 100) + 1;
            numero = Math.abs(numero);
            if(numero < 33){
               msg = "Baixo"; 
            } else if(numero <= 66) {
                msg = "Médio";
            }
            else {
                msg = "Alto";
            }
            System.out.println("Sorteio " + i+ ": " + numero + "-> " + msg);

            maior = Math.max(maior, numero);
        }
        System.out.println("------------------------------");
        System.out.println("Maior número sorteado: " + maior);
    }
}

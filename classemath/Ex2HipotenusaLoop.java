package classemath;
import java.util.Scanner;
public class Ex2HipotenusaLoop {
    public static void main(String[] args) {
        int rodada = 1;
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        while (rodada <= 3) {
            System.out.println("=== Rodada " + rodada + " ===");
            System.out.print("Digite o cateto a: ");
            a = scanner.nextInt();
            System.out.print("Digite o cateto b: ");
            b = scanner.nextInt();
            float triangulo = (a * b) / 2;
            double hipotenusa = Math.hypot(a, b);
            double hypoArredondada = Math.ceil(hipotenusa);
            System.out.println("hipotenusa: " + hipotenusa);
            System.out.println("Hipotenusa arredondada: " + hypoArredondada);
            System.out.println("Área do triângulo: " + triangulo);
            rodada += 1;
        }

        scanner.close();
    }
}

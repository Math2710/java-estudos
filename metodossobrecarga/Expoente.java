package metodossobrecarga;

public class Expoente {

    public static void elevar() {
        System.out.println("Este método não calcula nada!");
    }

    public static double elevar(double i) {
        return i * i;
    }
    

    public static double elevar(double i, double j) {
        return Math.pow(i, j);
    }

}

package StopnCode;

public class EsercizioSette {
    public static void main(String[] args) {
        int dividendo = 53;
        int divisore = 3;
        int quoto = dividendo/divisore;
        int resto = dividendo - (divisore*quoto); // dividendo % divisore
        double quoziente = (double) dividendo / divisore;

        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisore: " + divisore);
        System.out.println("Quoto (in N): " + quoto);
        System.out.println("Resto (in N): " + resto);
        System.out.println("Quoziente (in R): " + quoziente);
    }
}

package StopnCode;

public class EsercizioNove {
    public static void main(String[] args) {
        double variabile = 129.89;
        System.out.println("Il valore della variabile " + variabile + " senza parte decimale è: " + (int)variabile);
        System.out.println("Il valore della variabile " + variabile + " senza parte decimale è: " + (int)Math.floor(variabile));
        System.out.println("Il valore della variabile " + variabile + " ARROTONDATO è: " + String.format("%.0f", variabile));
    }
}

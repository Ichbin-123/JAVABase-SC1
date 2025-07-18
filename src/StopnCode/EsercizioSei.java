package StopnCode;

import java.time.LocalDate;

public class EsercizioSei {
    public static void main(String[] args) {
        // short eta = ((short)((LocalDate.now().getYear() - 1980)+1));
        System.out.println("Il numero dei tuoi anni + 1 " + ((((short)((LocalDate.now().getYear() - 1980)+1))%2!=0) ? "NON" : "") +" è un numero pari!");
    }
}

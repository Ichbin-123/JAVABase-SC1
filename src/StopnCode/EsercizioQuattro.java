package StopnCode;

import java.time.LocalDate;
import java.util.Date;

public class EsercizioQuattro {
    public static void main(String[] args) {
        final short annoNascita = 1980;
        LocalDate oggi = LocalDate.now();
        short annoAttuale = (short)oggi.getYear();
        byte eta = (byte)(annoAttuale - annoNascita);
        boolean controlloMaggioreEta = EsercizioDue.isMaggiore(eta);

        System.out.println("L'età dell'utente è di: " + eta + " anni.");
        EsercizioDue.isMaggioreStampa(controlloMaggioreEta);
        System.out.println("L'utente è maggiorenne: " + controlloMaggioreEta);
    }
}

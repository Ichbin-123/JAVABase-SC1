package StopnCode;

import java.util.Date;

public class EsercizioDue {
    public static void main(String[] args) {
        byte eta = 45;
        Date oggi = new Date();
        double reddito = Math.round(((Math.random()*50000.00)+1.00)*100.0)/100.0;
        String nome = "Marco";
        String cognome = "Fuchs";
        boolean controlloEta = isMaggiore(eta);
        char inizialeCognome = inizialeCognomeUtente(cognome);

        stampaDatiUtente(nome, cognome, inizialeCognome, eta, oggi, reddito);
    }

    public static boolean isMaggiore(byte eta){
        if(eta>=18) return true;
        return false;
    }

    public static void isMaggioreStampa(boolean isMaggiore){
        if(isMaggiore) System.out.println("L'utente è maggiorenne");
        else System.out.println("L'utente è minorenne");
    }

    public static char inizialeCognomeUtente(String cognome){
        return cognome.charAt(0);
    }

    public static void stampaDatiUtente(String nome, String cognome, char inizialeCognome, byte eta, Date oggi, double reddito){
        System.out.println("Nome Utente: " + nome);
        System.out.println("Cognome Utente: " + cognome);
        System.out.println("Iniziale Cognome: " + inizialeCognome);
        isMaggioreStampa(isMaggiore(eta));
        System.out.println("Età utente: " + eta);
        System.out.println("Data di oggi: " + oggi);
        System.out.println("Reddito: " + reddito + " CHF");

    }
}

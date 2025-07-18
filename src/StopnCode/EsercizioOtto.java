package StopnCode;

public class EsercizioOtto {
    public static void main(String[] args) {
        String greating = "Ciao Mondo";
        byte indexGreating = (byte) greating.indexOf('o');
        System.out.println("L'indice della prima lettera 'o' nella stringa è un numero " + ((indexGreating%2==0) ? "PARI" : "DISPARI"));

        for(int i= 0; i< greating.length() -1; i++){
            if(greating.charAt(i)=='o' && i%2==0) {
                System.out.println("L'indice della prima lettera 'o' nella stringa è un numero PARI");
                break;
            } else if(greating.charAt(i)=='o' && i%2!=0) {
                System.out.println("L'indice della prima lettera 'o' nella stringa è un numero DISPARI");
                break;
            }
        }

    }
}

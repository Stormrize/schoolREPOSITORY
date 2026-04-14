/**
 * 
 */
public class InstaStats {
    public static int hashTag(String text, int index) {
        int indexMerken = -1;
        int indexZaehler;
        char aktuellesZeichen;
        for (indexZaehler = index; indexZaehler < text.length(); indexZaehler++) {
            aktuellesZeichen = text.charAt(indexZaehler);
            if (aktuellesZeichen == '#') {
                indexMerken = indexZaehler;
                break;
            }
        }
        return indexMerken;
    }    

    public static int buchstabeZaehlen(char zeichen, String text) {
        int indexMerken = 0;
        int indexZaehler;
        char aktuellesZeichen;
        String newText = text.toLowerCase();
        for (indexZaehler = 0; indexZaehler < newText.length(); indexZaehler++) {
            aktuellesZeichen = newText.charAt(indexZaehler);
            if (aktuellesZeichen == zeichen) {
                indexMerken++;
            }   
        }
        return indexMerken;
    }

    public static String statistik(String text) {
        String ergebnis = "STATISTIK";
        for (char buchstabe = 'a'; buchstabe <= 'z'; buchstabe++) {
            int anzahl = buchstabeZaehlen(buchstabe, text);
            if (anzahl >= 0) {
                ergebnis += buchstabe + ": " + anzahl + "\n";
            }
        }
        return ergebnis;
    }
}

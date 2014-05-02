package domain.ohha.miinaharava;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Pelin Main luokka joka kysyy käyttäjältä halutun pelimuodon ja luo Kentta, Sovelluslogiikka ja Kayttoliittyma oliot.
 * @author Antti
 */
public class Main {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String leveysString, korkeusString, miinojenString;

        int leveys;
        int korkeus;
        int miinojenMaara;

        int pikapeli = JOptionPane.showConfirmDialog(null, "Suoraan peliin", "Miinaharava", JOptionPane.YES_NO_OPTION);

        if (pikapeli == 0) {
            leveys = 16;
            korkeus = 16;
            miinojenMaara = 40;
        } else {
            leveysString = JOptionPane.showInputDialog("Anna leveys");
            korkeusString = JOptionPane.showInputDialog("Anna korkeus");
            miinojenString = JOptionPane.showInputDialog("Anna miinojen määrä");

            try {
                leveys = Integer.parseInt(leveysString);
            } catch (NumberFormatException e) {
                leveys = 16;
            }
            try {
                korkeus = Integer.parseInt(korkeusString);
            } catch (NumberFormatException e) {
                korkeus = 16;
            }
            try {
                miinojenMaara = Integer.parseInt(miinojenString);
            } catch(NumberFormatException e){
                miinojenMaara = 40;
            }

        }

        Kentta kentta = new Kentta(leveys, korkeus, miinojenMaara);
        
        Sovelluslogiikka sovelluslogiikka = new Sovelluslogiikka(kentta);
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(kentta, leveys, korkeus, sovelluslogiikka);
    }
}

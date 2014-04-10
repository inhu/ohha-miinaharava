package domain.ohha.miinaharava;

import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Antti
 */
public class Kayttoliittyma extends JFrame {

    private Kentta kentta;
    private int leveys;
    private int korkeus;
    private JButton napit[][];
    private Sovelluslogiikka logiikka;

    /**
     *
     * @param kentta
     * @param leveys
     * @param korkeus
     */
    public Kayttoliittyma(Kentta kentta, int leveys, int korkeus, Sovelluslogiikka logiikka) {
        this.kentta = kentta;
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.logiikka = logiikka;
        this.napit = new JButton[leveys][korkeus];

        this.setTitle("Miinaharava");
        this.setLayout(new GridLayout(leveys, korkeus));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        luoNapit();
        this.setSize(26 * leveys, 26 * korkeus);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void luoNapit() {
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                napit[i][j] = new JButton();
                napit[i][j].setSize(18, 18);
                napit[i][j].addMouseListener(new TapahtumanKuuntelija(logiikka, this, i, j));
                this.add(napit[i][j]);
            }
        }
    }

    public void havisitPelin() throws IOException {
        int i = JOptionPane.showConfirmDialog(null, "Hävisit pelin, haluatko aloittaa uuden pelin?", "Miinaharava", JOptionPane.OK_OPTION);
        if (i == 0) {
            String[] args = {};
            Main.main(args);
            this.dispose();
        } else {
            System.exit(0);

        }
    }

    public void voititPelin() throws IOException {
        //tämä on nyt tässä vaiheessa kopio pastaa mutta tulee muuttamaan tod.näk. myöhemmin
        int i = JOptionPane.showConfirmDialog(null, "Voitit pelin, haluatko aloittaa uuden pelin?", "Miinaharava", JOptionPane.OK_OPTION);
        if (i == 0) {
            String[] args = {};
            Main.main(args);
            this.dispose();
        } else {
            System.exit(0);

        }
    }
}

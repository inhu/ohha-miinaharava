/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ohha.miinaharava;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Antti
 */
public class TapahtumanKuuntelija implements MouseListener {

    private int x;
    private int y;
    private Sovelluslogiikka logiikka;
    private Kayttoliittyma kali;

    /**
     *
     * @param logiikka
     * @param kali
     * @param i
     * @param j
     */
    public TapahtumanKuuntelija(Sovelluslogiikka logiikka, Kayttoliittyma kali, int i, int j) {
        this.x = i;
        this.y = j;
        this.logiikka = logiikka;
        this.kali = kali;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            //jos avaaRuutu palauttaa false tarkoittaa että avattiin miina ja tämän jälkeen kerrotaan kalille että peli on hävitty joka avaa ikkunan jossa tämä lukee
            if (!logiikka.avaaRuutu(x, y)) {
                try {
                    kali.havisitPelin();
                } catch (IOException ex) {
                    Logger.getLogger(TapahtumanKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (SwingUtilities.isRightMouseButton(e)) {
            //liputaRuutu palauttaa true jos kaikki miinat on liputettu oikein ja kertoo siiten kalille että peli on voitettu
            if (logiikka.liputaRuutu(x, y)) {
                try {
                    kali.voititPelin();
                } catch (IOException ex) {
                    Logger.getLogger(TapahtumanKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.kali.paivita();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

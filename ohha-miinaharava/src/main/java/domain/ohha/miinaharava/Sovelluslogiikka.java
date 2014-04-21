package domain.ohha.miinaharava;

/**
 *
 * @author Antti
 */
public class Sovelluslogiikka {

    Kentta kentta;
    boolean jatkuuko;
    boolean voititko;

    /**
     *
     * @param kentta
     */
    public Sovelluslogiikka(Kentta kentta) {
        this.kentta = kentta;
        this.jatkuuko = true;
        this.voititko = true;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean avaaRuutu(int x, int y) {
        Ruutu ruutu = this.kentta.getRuutu(x, y);
        if (!ruutu.getAvattu()) {
            ruutu.avaa();
            if (!ruutu.getMiina() && ruutu.getViereisetMiinat() == 0) {
                avaaViereiset(x, y);
            }
            return !ruutu.getMiina();
        }
        return true;
    }

    private void avaaViereiset(int x, int y) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((i == 0 && j == 0)) {
                    //tarkistetaan että ruutu on kentän sisällä
                } else if ((x + i) > -1 && (y + j) > -1 && (x + i) < this.kentta.getLeveys() && (y + j) < this.kentta.getKorkeus()) {
                    avaaRuutu(x+i, y+j);
                }
            }
        }
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean liputaRuutu(int x, int y) {
        this.kentta.getRuutu(x, y).liputa();
        
        return onkoKaikkiMiinatLiputettu();

    }

    private boolean onkoKaikkiMiinatLiputettu() {
        for (int i = 0; i < this.kentta.getLeveys(); i++) {
            for (int j = 0; j < this.kentta.getKorkeus(); j++) {
                Ruutu ruutu = kentta.getRuutu(i, j);
                //käydään kaikki ruudut läpi ja onko jossakin miina ilman lippu tai lippu ilman miinaa, ja jos on niin palautetaan false
                if ((ruutu.getMiina() && !ruutu.getLippu()) || (!ruutu.getMiina() && ruutu.getLippu() && !ruutu.getAvattu())) {
                    return false;
                }
            }
        }
        return true;
    }
}

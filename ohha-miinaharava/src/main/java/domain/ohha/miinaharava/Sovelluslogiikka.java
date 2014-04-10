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
            return !ruutu.getMiina();
        }
        return true;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean liputaRuutu(int x, int y) {
        this.kentta.getRuutu(x, y).liputa();
        if (onkoKaikkiMiinatLiputettu()) {
            return true;
        }
        return false;

    }

    private boolean onkoKaikkiMiinatLiputettu() {
        for (int i = 0; i < this.kentta.getLeveys(); i++) {
            for (int j = 0; j < this.kentta.getKorkeus(); j++) {
                Ruutu ruutu = kentta.getRuutu(i, j);
                //käydään kaikki ruudut läpi ja onko jossakin miina ilman lippu tai lippu ilman miinaa, ja jos on niin palautetaan false
                if ((ruutu.getMiina() && !ruutu.getLippu()) || (!ruutu.getMiina() && ruutu.getAvattu())) {
                    return false;
                }
            }
        }
        return true;
    }
}

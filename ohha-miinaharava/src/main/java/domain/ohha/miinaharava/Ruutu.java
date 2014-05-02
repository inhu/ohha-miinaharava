
package domain.ohha.miinaharava;


/**
 * Ruutu luokka kuvaa Miinaharava-pelin yhden ruudun arvoja.
 * @author Antti
 */
public class Ruutu {
    private boolean onkoAvattu;
    private boolean onkoMiina;
    private boolean onkoLippu;
    private int viereisetMiinat;
    /**
     * Ruutu luokan konstruktori
     */
    public Ruutu(){
        this.onkoAvattu=false;
        this.onkoMiina=false;
        this.onkoLippu=false;
        this.viereisetMiinat=0;
    }
    /**
     * Metodi vaihtaa onkoLippu boolean arvon vastakkaiseksi.
     */
    public void liputa(){
        onkoLippu=!onkoLippu;
    }
    /**
     *
     */
    public void asetaMiina(){
        onkoMiina=true;
    }
    /**
     *
     */
    public void avaa(){
        onkoAvattu=true;
    }
    //viereisten miinojen lasku tullaan tekemään miinojen luonnin jälkeen luokkassa Kentta
    /**
     *
     * @param i
     */
    public void viereistenMiinojenMaara(int i){
        this.viereisetMiinat=i;
    }
    /**
     *
     * @return
     */
    public boolean getMiina(){
        return onkoMiina;
    }
    /**
     *
     * @return
     */
    public boolean getLippu(){
        return onkoLippu;
    }
    /**
     *
     * @return
     */
    public boolean getAvattu(){
        return onkoAvattu;
    }
    /**
     *
     * @return
     */
    public int getViereisetMiinat(){
        return viereisetMiinat;
    }
}

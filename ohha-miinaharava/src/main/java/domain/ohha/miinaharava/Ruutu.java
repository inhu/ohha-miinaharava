
package domain.ohha.miinaharava;


public class Ruutu {
    private boolean onkoAvattu;
    private boolean onkoMiina;
    private boolean onkoLippu;
    private int viereisetMiinat;
    public Ruutu(){
        this.onkoAvattu=false;
        this.onkoMiina=false;
        this.onkoLippu=false;
        this.viereisetMiinat=0;
    }
    public void liputa(){
        onkoLippu=!onkoLippu;
    }
    public void asetaMiina(){
        onkoMiina=true;
    }
    public void avaa(){
        onkoAvattu=true;
    }
    //viereisten miinojen lasku tullaan tekemään miinojen luonnin jälkeen luokkassa Kentta
    public void viereistenMiinojenMaara(int i){
        this.viereisetMiinat=i;
    }
    public boolean getMiina(){
        return onkoMiina;
    }
    public boolean getLippu(){
        return onkoLippu;
    }
    public boolean getAvattu(){
        return onkoAvattu;
    }
    
}

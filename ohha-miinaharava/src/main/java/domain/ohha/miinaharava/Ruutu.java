
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
}

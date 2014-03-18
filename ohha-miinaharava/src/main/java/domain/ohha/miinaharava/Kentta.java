
package domain.ohha.miinaharava;


public class Kentta {
    private Ruutu[][] ruudut;
    private int miinojenMaara;
    
    public Kentta(int leveys, int korkeus, int miinojenMaara){
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
             ruudut[i][j]= new Ruutu();
            }
        }
        this.miinojenMaara=miinojenMaara;
    }
    public Ruutu getRuutu(int x,int y){
        return this.ruudut[x][y];
    }
}

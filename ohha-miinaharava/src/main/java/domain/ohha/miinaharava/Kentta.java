package domain.ohha.miinaharava;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Random;

/**
 *
 * @author Antti
 */
public class Kentta {

    private Ruutu[][] ruudut;
    private int miinojenMaara;
    private int leveys;
    private int korkeus;

    /**
     *
     * @param leveys
     * @param korkeus
     * @param miinojenMaara
     */
    public Kentta(int leveys, int korkeus, int miinojenMaara) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.ruudut = new Ruutu[leveys][korkeus];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                ruudut[i][j] = new Ruutu();
            }
        }
        this.miinojenMaara = miinojenMaara;
        luoMiinat();
        laskeViereisetMiinat();
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public Ruutu getRuutu(int x, int y) {
        return this.ruudut[x][y];
    }
    public int getLeveys(){
        return this.leveys;
    }
    public int getKorkeus(){
        return this.korkeus;
    }

    private void luoMiinat() {
        int m = this.miinojenMaara;
        Random r = new Random();
        while (m > 0) {
            int i = r.nextInt(this.leveys);
            int j = r.nextInt(this.korkeus);
            Ruutu ruutu = ruudut[i][j];
            if (!ruutu.getMiina()) {
                ruutu.asetaMiina();
                m--;
            }
        }
    }

    private void laskeViereisetMiinat() {
        for (int i = 0; i < ruudut.length; i++) {
            for (int j = 0; j < ruudut.length; j++) {
                Ruutu ruutu = ruudut[i][j];
                asetaViereiset(ruutu, i, j);
            }
        }
    }

    private void asetaViereiset(Ruutu ruutu, int x, int y) {
        int miinat = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                //tarkistetaan ettei ruutun omaa pommia lasketa
                if ((i == 0 && j == 0)) {
                //tarkistetaan että ruutu on kentän sisällä
                } else if ((x+i)>-1 && (y+j)>-1  && (x+i)<this.leveys && (y+j)<this.korkeus){
                    Ruutu apu = ruudut[x+i][y+j];
                    if(apu.getMiina()){
                        miinat++;
                    }
                }
            }
        }

        ruutu.viereistenMiinojenMaara(miinat);
    }

    /**
     *
     */
    public void testausTulostus() {
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                Ruutu ruutu = ruudut[i][j];
                if (ruutu.getMiina()) {
                    System.out.print("¤");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
    
    /**
     *
     */
    public void viereisetMiinatTulostus(){
                for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                Ruutu ruutu = ruudut[i][j];
                if(ruutu.getMiina()){
                    System.out.print("¤");
                } else
                System.out.print(ruutu.getViereisetMiinat());
            }
            System.out.println("");
        }
    }
    
        /**
     *
     */
    public void viereisetMiinatTulostus2(){
                for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                Ruutu ruutu = ruudut[i][j];
                System.out.print(ruutu.getViereisetMiinat());
            }
            System.out.println("");
        }
    }
}

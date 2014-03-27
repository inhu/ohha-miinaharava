package domain.ohha.miinaharava;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SovelluslogiikkaTest {

    Kentta satunnainen;
    Kentta taynnaMiinoja;
    Sovelluslogiikka satunnaisLogiikka;
    Sovelluslogiikka taynnaLogiikka;
    Random r;

    @Before
    public void setUp() {
        this.satunnainen = new Kentta(20, 20, 30);
        this.taynnaMiinoja = new Kentta(5, 5, 25);
        this.satunnaisLogiikka = new Sovelluslogiikka(satunnainen);
        this.taynnaLogiikka = new Sovelluslogiikka(taynnaMiinoja);
        this.r = new Random();
    }

    @Test
    public void satunnaisenRuudunAvausTaydestaToimii() {
        assertEquals(this.taynnaLogiikka.avaaRuutu(r.nextInt(5), r.nextInt(5)), false);
    }

    @Test
    public void satunnaisenRuudunAvausSatunnaisestaToimii() {
        int x  = r.nextInt(20);
        int y = r.nextInt(20);
        assertEquals(this.satunnaisLogiikka.avaaRuutu(x, y), !satunnainen.getRuutu(x, y).getMiina());
    }
    @Test
    public void osaakoAvaaRuutuAvata(){
        this.satunnaisLogiikka.avaaRuutu(0, 0);
        assertEquals(satunnainen.getRuutu(0, 0).getAvattu(), true);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

import domain.ohha.miinaharava.Kentta;
import domain.ohha.miinaharava.Ruutu;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class KenttaTest {
    
    Kentta uusiKentta;
    int leveys;
    int korkeus;
    @Before
    public void setUp(){
        this.leveys=20;
        this.korkeus=20;
        this.uusiKentta = new Kentta(this.leveys, this.korkeus, 20);
    }
    @Test
    public void kostruktoriToimii(){
        Kentta kentta = new Kentta(20, 20, 20);
        assertNotNull(kentta);
    }
    @Test
    public void kulmaRuudutEiNull(){
        assertNotNull(uusiKentta.getRuutu(0, 0));
        assertNotNull(uusiKentta.getRuutu(0, this.korkeus-1));
        assertNotNull(uusiKentta.getRuutu(this.leveys-1, 0));
        assertNotNull(uusiKentta.getRuutu(this.leveys-1, this.korkeus-1));
    }
    @Test
    public void satunnainenRuutuEiNull(){
        Random r = new Random();
        assertNotNull(this.uusiKentta.getRuutu(r.nextInt(leveys), r.nextInt(korkeus)));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ohha.miinaharava;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Antti
 */
public class RuutuTest {
    
    Ruutu uusiRuutu;
    @Before
    public void setUp(){
        this.uusiRuutu = new Ruutu();
    }
    @Test
    public void konstruktori(){
        Ruutu ruutu = new Ruutu();
        assertNotNull(ruutu);
    }
    @Test
    public void uudellaRuudullaEiLippua(){
        assertEquals(uusiRuutu.getLippu(),false);
    }
    @Test
    public void uudellaRuudullaEiMiinaa(){
        assertEquals(uusiRuutu.getMiina(),false);
    }
    @Test
    public void uusiRuutuEiAuki(){
        assertEquals(uusiRuutu.getAvattu(),false);
    }
    @Test
    public void kerranLiputusToimii(){
        uusiRuutu.liputa();
        assertEquals(uusiRuutu.getLippu(),true);
    }
    @Test
    public void kaksiKertaaLiputusToimii(){
        uusiRuutu.liputa();
        uusiRuutu.liputa();
        assertEquals(uusiRuutu.getLippu(),false);
    }
    @Test
    public void miinanAsettaminenToimii(){
        uusiRuutu.asetaMiina();
        assertEquals(uusiRuutu.getMiina(),true);
    }
    @Test
    public void avausToimiii(){
        uusiRuutu.avaa();
        assertEquals(uusiRuutu.getAvattu(),true);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
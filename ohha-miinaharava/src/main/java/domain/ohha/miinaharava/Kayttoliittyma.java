
package domain.ohha.miinaharava;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable{
    private JFrame frame;
    private Kentta kentta;
    private int leveys;
    private int korkeus;
    
    public Kayttoliittyma(Kentta kentta, int leveys, int korkeus){
        this.kentta = kentta;
        this.leveys = leveys;
        this.korkeus= korkeus;
    }
    
    @Override
    public void run(){
        frame = new JFrame("Miinaharava");
        frame.setPreferredSize(new Dimension(18*leveys, 18*korkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

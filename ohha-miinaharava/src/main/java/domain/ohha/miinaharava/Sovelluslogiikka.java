
package domain.ohha.miinaharava;


public class Sovelluslogiikka {
    
    Kentta kentta;
    boolean jatkuuko;
    boolean voititko;
    
    public Sovelluslogiikka(Kentta kentta){
        this.kentta = kentta;
        this.jatkuuko=true;
        this.voititko=true;
        
        //aloita();
    }

    private void aloita() {
        //x ja y avattavan ruudun koordinaatit jotka saadaa käyttöliittymältä(?) jossain vaiheessa jotenkin
        int x = 0;
        int y = 0;
        while(this.jatkuuko){
            boolean onnistuiko = avaaRuutu(x, y);
            if(!onnistuiko){
                this.jatkuuko=false;
                this.voititko=false;
            }
            
            //päivitä grafiikka
        }
        if(this.voititko){
            //voitit pelin
        } else{
            //hävisit pelin
        }
    }
    public boolean avaaRuutu(int x,int y){
        Ruutu ruutu = this.kentta.getRuutu(x, y);
        if(!ruutu.getAvattu()){
          ruutu.avaa();
          return !ruutu.getMiina();
        } 
        return true;
    }
    
    
}

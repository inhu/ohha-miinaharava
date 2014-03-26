package domain.ohha.miinaharava;

public class Main {

    public static void main(String[] args) {
        Kentta kentta = new Kentta(20, 20, 20);
        kentta.testausTulostus();
        kentta.viereisetMiinatTulostus();
   }
}

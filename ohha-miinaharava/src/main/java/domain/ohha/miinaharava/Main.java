package domain.ohha.miinaharava;

public class Main {

    public static void main(String[] args) {
        Kentta kentta = new Kentta(5, 5, 15);
        kentta.testausTulostus();
        System.out.println("");
        kentta.viereisetMiinatTulostus();
        System.out.println("");
        kentta.viereisetMiinatTulostus2();
   }
}

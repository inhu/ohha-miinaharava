Ohjelman rakennetta suunnitellesa pyrin siihen että sovelluslogiikka ja käyttöliittymä luokat eivät olisi suoraan tekemisissä toistensa kanssa, tässä myös suurinpiirtein onnistuin.  

Lopullisessa ohjelmassa Mainin tehtävänä on kysyä käyttäjältä haluttu kentän koko ja luoda kenttä. Kun kenttä on luotu Main luo sovelluslogiikan ja käyttöliittymän ja antaa niille parametrinä aiemmin luodun kentän.

Käyttöliittymän tehtänä on luoda JButton napit ja yhdistää jokaiseen nappiin oma tapahtumankuuntelija. Kun napit on luotu käyttöliittymän tehtävä on päivittää ruutujen värejä ja ilmoittaa pelin lopputulos ja kysyä pelataanko uudestaan.  

Tapahtumankuuntelija toimii siltana sovelluslogiikan ja käyttöliittymän välillä. Kun kuuntelija luodaan sille kerrotaan sen koordinaatti jota sen lähettää sovelluslogiikaan avaaRuutu metodille, samalla se myös palauttaa käyttöliittymälle boolean arvona sen jos peli loppui.  

Sovelluslogiikan tehtävä on yksinkertaisesti muuttaa kentän ruutu halutulla tavalla ja tarkistaa onko peli päättynyt.  

Kun kenttä luodaan se luo tarvittavat ruudut ja arpoo ruuduille oikean määrän miinoja. Luomisen jälkeen kentästä käytetään oikeastaan vain getRuutu(x,y) metodia.  

Ruutu on yksinkertainen kasa booleaneja joilla merkataan ruudun tilaa, esim onko lippu tai avatattu yms.
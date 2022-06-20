package prodavnica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Prodavnica_GlavnaKlasa prodavnicaMaxi = new Prodavnica_GlavnaKlasa();
        prodavnicaMaxi.setNaziv("Maxi");
        prodavnicaMaxi.setPibBroj(123456);

        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        proizvodi.add(new Proizvod(150, "ajvar", "crveni", "123456789"));
        proizvodi.add(new Proizvod(100, "grejp", "zuti", "456789456"));

        prodavnicaMaxi.setProizvodi(proizvodi);

        ArrayList<Kupac> kupci = new ArrayList<>();
        kupci.add(new Kupac("Ana", "Petrovic", "063123456", "ana@bako.com", true));
        kupci.add(new Kupac("Sanja", "Petrovic", "063123789", "sanja@balog.com", false));

        prodavnicaMaxi.setKupci(kupci);

        double ukupno = 0;
        String noviProizvod = "";
        while (!noviProizvod.equals("kraj")) {

            System.out.println("Unesite novi proizvod (imamo samo ajvar i grejp) ili 'kraj' za zavrsetak kupovine");
            noviProizvod = s.nextLine();

            for (int i = 0; i < proizvodi.size(); i++) {
                if (noviProizvod.equals(proizvodi.get(i).getNazivProizvoda())) {
                    ukupno += proizvodi.get(i).getCena();
                }
            }
        }

        System.out.println("Medjuzbir je " + ukupno);
        System.out.println("Unesite ime kupca");

        String odabraniKupac = s.nextLine();

        for (int i = 0; i < kupci.size(); i++) {
            if (odabraniKupac.equals(kupci.get(i).getImeKupca() + " " + kupci.get(i).getPrezimeKupca()) && kupci.get(i).premiumKupac == true ) {
                    ukupno *= 0.85;
            }
        }
        System.out.println("Vas konacan racun je " + ukupno);

    }
}

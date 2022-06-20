package prodavnica;

import java.util.ArrayList;

public class Prodavnica_GlavnaKlasa {
    public String naziv;
    public int pibBroj;
    public ArrayList<Proizvod> proizvodi;
    public ArrayList<Kupac> kupci;

    public Prodavnica_GlavnaKlasa(){}

    public Prodavnica_GlavnaKlasa(String naziv, int pibBroj, ArrayList<Proizvod> proizvodi, ArrayList<Kupac> kupci) {
        this.naziv = naziv;
        this.pibBroj = pibBroj;
        this.proizvodi = proizvodi;
        this.kupci = kupci;}


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPibBroj() {
        return pibBroj;
    }

    public void setPibBroj(int pibBroj) {
        this.pibBroj = pibBroj;
    }

    public ArrayList<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(ArrayList<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public ArrayList<Kupac> getKupci() {
        return kupci;
    }

    public void setKupci(ArrayList<Kupac> kupci) {
        this.kupci = kupci;
    }

    @Override
    public String toString() {
        return "Prodavnica_GlavnaKlasa{" +
                "naziv='" + naziv + '\'' +
                ", pibBroj=" + pibBroj +
                ", proizvodi=" + proizvodi +
                ", kupci=" + kupci +
                '}';
    }







}

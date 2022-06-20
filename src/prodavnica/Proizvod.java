package prodavnica;

public class Proizvod {

    public double cena;
    public String nazivProizvoda;
    public String boja;
    public String barkod;

    Proizvod(){}

    public Proizvod(double cena, String nazivProizvoda, String boja, String barkod) {
        this.cena = cena;
        this.nazivProizvoda = nazivProizvoda;
        this.boja = boja;
        this.barkod = barkod;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {this.cena = cena;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "cena=" + cena +
                ", nazivProizvoda='" + nazivProizvoda + '\'' +
                ", boja='" + boja + '\'' +
                ", barkod='" + barkod + '\'' +
                '}';
    }
}

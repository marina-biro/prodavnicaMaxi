package prodavnica;

public class Kupac {
    public String imeKupca;
    public String prezimeKupca;
    public String brojTelefona;
    public String emailKupca;
    public boolean premiumKupac;


    public Kupac(){}

    public Kupac(String imeKupca, String prezimeKupca, String brojTelefona, String emailKupca, boolean premiumKupac) {
        this.imeKupca = imeKupca;
        this.prezimeKupca = prezimeKupca;
        this.brojTelefona = brojTelefona;
        this.emailKupca = emailKupca;
        this.premiumKupac = premiumKupac;
    }

    public String getImeKupca() {
        return imeKupca;
    }

    public void setImeKupca(String imeKupca) {
        this.imeKupca = imeKupca;
    }

    public String getPrezimeKupca() {
        return prezimeKupca;
    }

    public void setPrezimeKupca(String prezimeKupca) {
        this.prezimeKupca = prezimeKupca;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getEmailKupca() {
        return emailKupca;
    }

    public void setEmailKupca(String emailKupca) {
        this.emailKupca = emailKupca;
    }

    public boolean isPremiumKupac() {
        return premiumKupac;
    }

    public void setPremiumKupac(boolean premiumKupac) {
        this.premiumKupac = premiumKupac;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                "imeKupca='" + imeKupca + '\'' +
                ", prezimeKupca='" + prezimeKupca + '\'' +
                ", brojTelefona='" + brojTelefona + '\'' +
                ", emailKupca='" + emailKupca + '\'' +
                ", premiumKupac=" + premiumKupac +
                '}';
    }
}

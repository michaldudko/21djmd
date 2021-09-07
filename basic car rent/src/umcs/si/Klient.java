package umcs.si;

public class Klient {
    String imie;
    String nazwisko;
    String pesel;
    String telefon;

    public Klient() {
    }

    public Klient(String imie, String nazwisko, String pesel, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.telefon = telefon;
    }

    public String Wyswietlaj() {
        return "Imie: " + imie + ", Nazwisko: " + nazwisko + ", PESEL: " + pesel + ", Telefon: " + telefon;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
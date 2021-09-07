package umcs.si;

public class Samochod {
    String marka;
    String typ;
    String przebieg;
    String numerRejestracyjny;

    public Samochod() {
    }

    public Samochod(String marka, String typ, String przebieg, String numerRejestracyjny) {
        this.marka = marka;
        this.typ = typ;
        this.przebieg = przebieg;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String Wyswietlaj() {
        return "Marka: " + marka + ", Typ: " + typ + ", Przebieg: " + przebieg + ", Nr rejestracyjny: " + numerRejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(String przebieg) { this.przebieg = przebieg;}

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }
}

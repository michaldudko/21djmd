package umcs.si;

public class Transakcja {
    Samochod samochod;
    Klient klient;
    DataDnia odKiedy;
    DataDnia doKiedy;

    public Transakcja() {
    }

    public Transakcja(Samochod samochod, Klient klient, DataDnia odKiedy, DataDnia doKiedy) {
        this.samochod = samochod;
        this.klient = klient;
        this.odKiedy = odKiedy;
        this.doKiedy = doKiedy;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public DataDnia getOdKiedy() {
        return odKiedy;
    }

    public void setOdKiedy(DataDnia odKiedy) {
        this.odKiedy = odKiedy;
    }

    public DataDnia getDoKiedy() {
        return doKiedy;
    }

    public void setDoKiedy(DataDnia doKiedy) {
        this.doKiedy = doKiedy;
    }
}

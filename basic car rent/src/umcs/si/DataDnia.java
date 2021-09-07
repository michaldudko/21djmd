package umcs.si;

public class DataDnia {
    private int dzien;
    private int miesiac;
    private int rok;

    public DataDnia() {
    }

    public DataDnia(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public String Wyswietlaj() {
        return dzien + "." + miesiac + "." + rok;
    }

}

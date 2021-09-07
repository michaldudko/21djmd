package umcs.si;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.*;

import static javax.swing.JOptionPane.CLOSED_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;


public class Main {
    Map<String, Samochod> zbiorSamochodow = new <String, Samochod>HashMap();
    Map<String, Klient> zbiorKlientow = new <Klient>HashMap();
    Set<Transakcja> zbiorTransakcji = new <Transakcja>HashSet();

    public static void main(String[] args) throws FileNotFoundException {
        Object[] options = {"Tak", "Nie"};
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(new URL("https://icons.iconarchive.com/icons/iconsmind/outline/32/Car-2-icon.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon2 = null;
        try {
            icon2 = new ImageIcon(new URL("https://icons.iconarchive.com/icons/iconsmind/outline/32/Add-User-icon.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon3 = null;
        try {
            icon3 = new ImageIcon(new URL("https://icons.iconarchive.com/icons/iconsmind/outline/32/Dollar-icon.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon4 = null;
        try {
            icon4 = new ImageIcon(new URL("https://icons.iconarchive.com/icons/praveen/minimal-outline/32/calendar-icon.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon5 = null;
        try {
            icon5 = new ImageIcon(new URL("https://icons.iconarchive.com/icons/icons8/windows-8/72/Ecommerce-Buy-icon.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        Main Zbior = input();
        if (Zbior == null) {
            Zbior = new Main();
        }
        while (true) {

            String message = "<html><body><div width='220px' align='center'>Witamy w wypozyczalni samochodow!<br>Wybierz kategorie</div></body></html>";
            JLabel messageLabel = new JLabel(message);
            int odp = JOptionPane.showOptionDialog(null, messageLabel,
                    "Wypozyczalnia Samochodow", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon,
                    new String[]{"Samochody", "Klienci", "Transakcje", "Zakoncz"}, "Zakoncz");

            if (odp == 0) {
                while (true) {
                    int odp1 = JOptionPane.showOptionDialog(null, "Czy planujesz dodac nowy samochod do listy?", "Dodaj samochod", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
                    if (odp1 == NO_OPTION || odp1 == CLOSED_OPTION) {
                        break;
                    }
                    String m = (String) JOptionPane.showInputDialog(null, "Wprowadz marke samochodu:", "Wprowadz samochod", JOptionPane.PLAIN_MESSAGE, icon, null, "");
                    String t = (String) JOptionPane.showInputDialog(null, "Wprowadz typ samochodu:", "Wprowadz samochod", JOptionPane.PLAIN_MESSAGE, icon, null, "");
                    String p = (String) JOptionPane.showInputDialog(null, "Wprowadz przebieg:", "Wprowadz samochod", JOptionPane.PLAIN_MESSAGE, icon, null, "");
                    String nr = (String) JOptionPane.showInputDialog(null, "Wprowadz numer rejestracyjny samochodu:", "Wprowadz Samochod", JOptionPane.PLAIN_MESSAGE, icon, null, "");
                    Samochod s = new Samochod(m, t, p, nr);
                    Zbior.zbiorSamochodow.put(s.getNumerRejestracyjny(), s);
                }
            }
            if (odp == 1) {
                while (true) {
                    int odp2 = JOptionPane.showOptionDialog(null, "Czy chcesz dodac nowego klienta do listy?", "Lista Klientow", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon2, options, options[0]);
                    if (odp2 == NO_OPTION || odp2 == CLOSED_OPTION) {
                        break;
                    }
                    String i = (String) JOptionPane.showInputDialog(null, "Wprowadz imie klienta:", "Wprowadz Klienta", JOptionPane.PLAIN_MESSAGE, icon2, null, "");
                    String n = (String) JOptionPane.showInputDialog(null, "Wprowadz nazwisko klienta:", "Wprowadz Klienta", JOptionPane.PLAIN_MESSAGE, icon2, null, "");
                    String p = (String) JOptionPane.showInputDialog(null, "Wprowadz pesel klienta:", "Wprowadz Klienta", JOptionPane.PLAIN_MESSAGE, icon2, null, "");
                    String t = (String) JOptionPane.showInputDialog(null, "Wprowadz telefon klienta:", "Wprowadz Klienta", JOptionPane.PLAIN_MESSAGE, icon2, null, "");
                    Klient k = new Klient(i, n, p, t);
                    Zbior.zbiorKlientow.put(k.getPesel(), k);
                }
            }
            if (odp == 2) {
                while (true) {
                    int odp3 = JOptionPane.showOptionDialog(null, "Czy chcesz przeprowadzic transakcje?", "Transakcja", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon3, options, options[0]);
                    if (odp3 == NO_OPTION || odp3 == CLOSED_OPTION) {
                        break;
                    }
                    String listaSamochodow = "";
                    for (Map.Entry<String, Samochod> entry : Zbior.zbiorSamochodow.entrySet()) {
                        listaSamochodow = listaSamochodow + "Informacje o samochodzie:\n" + entry.getValue().Wyswietlaj() + "\n";
                    }
                    String listaKlientow = "";
                    for (Map.Entry<String, Klient> entry : Zbior.zbiorKlientow.entrySet()) {
                        listaKlientow = listaKlientow + "Informacje o kliencie:\n" + entry.getValue().Wyswietlaj() + "\n";
                    }
                    String pesel = (String) JOptionPane.showInputDialog(null, listaKlientow + "\n" + "Wprowadz pesel klienta: ", "Wprowadz PESEL", JOptionPane.PLAIN_MESSAGE, icon3, null, "");
                    String numer_rej = (String) JOptionPane.showInputDialog(null, listaSamochodow + "\n" + "Wprowadz numer rejestracyjny samochodu: ", "Wprowadz nr Rejestracyjny", JOptionPane.PLAIN_MESSAGE, icon, null, "");

                    String odKiedy_dzien = (String) JOptionPane.showInputDialog(null, "Podaj dzien rozpoczecia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");
                    String odKiedy_miesiac = (String) JOptionPane.showInputDialog(null, "Podaj miesiac rozpoczecia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");
                    String odKiedy_rok = (String) JOptionPane.showInputDialog(null, "Podaj rok rozpoczecia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");

                    String doKiedy_dzien = (String) JOptionPane.showInputDialog(null, "Podaj dzien zakonczenia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");
                    String doKiedy_miesiac = (String) JOptionPane.showInputDialog(null, "Podaj miesiac zakonczenia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");
                    String doKiedy_rok = (String) JOptionPane.showInputDialog(null, "Podaj rok zakonczenia wynajmu", "Data", JOptionPane.PLAIN_MESSAGE, icon4, null, "");

                    Transakcja nowaTransakcja = new Transakcja(Zbior.zbiorSamochodow.get(numer_rej), Zbior.zbiorKlientow.get(pesel),
                            new DataDnia(Integer.parseInt(odKiedy_dzien), Integer.parseInt(odKiedy_miesiac), Integer.parseInt(odKiedy_rok)), new DataDnia(Integer.parseInt(doKiedy_dzien), Integer.parseInt(doKiedy_miesiac), Integer.parseInt(doKiedy_rok)));
                    Zbior.zbiorTransakcji.add(nowaTransakcja);

                    String listaTransakcji = "";
                    for (Transakcja transakcja : Zbior.zbiorTransakcji) {
                        listaTransakcji = listaTransakcji + "Marka pojazdu: " + transakcja.getSamochod().getMarka() + "\n" + "Typ pojazdu: " + transakcja.getSamochod().getTyp() + "\n" + "Numer rejestracyjny: " + transakcja.getSamochod().getNumerRejestracyjny() + "\n" +
                                "\nPESEL klienta: " + transakcja.getKlient().getPesel() + "\n" + "Imie: " + transakcja.getKlient().getImie() + "\n" + "Nazwisko: " + transakcja.getKlient().getNazwisko() + "\n" +
                                "\nPoczatek wypozyczenia: " + transakcja.getOdKiedy().Wyswietlaj() + "\n" + "Koniec wypozyczenia: " + transakcja.getDoKiedy().Wyswietlaj() + "\n";
                    }
                    JOptionPane.showOptionDialog(null, listaTransakcji, "Transakcje", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon5, null, null);
                }
            }
            if (odp == 3) {
                break;
            }
        }
        output(Zbior);
    }

    private static void output(Object obj) throws FileNotFoundException {
        XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("import.txt")));
        enc.writeObject(obj);
        enc.close();
    }

    private static Main input() {
        XMLDecoder enc = null;
        try {
            enc = new XMLDecoder(new BufferedInputStream(new FileInputStream("import.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        Object result = enc.readObject();
        enc.close();
        return (Main) result;
    }

    public Map<String, Klient> getListaKlientow() {
        return zbiorKlientow;
    }

    public void setListaKlientow(Map<String, Klient> zbiorKlientow) {
        this.zbiorKlientow = zbiorKlientow;
    }

    public Map<String, Samochod> getListaSamochodow() {
        return zbiorSamochodow;
    }

    public void setListaSamochodow(Map<String, Samochod> zbiorSamochodow) {
        this.zbiorSamochodow = zbiorSamochodow;
    }
}
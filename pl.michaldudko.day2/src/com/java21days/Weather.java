package com.java21days;

public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah+ " stopni Farenheita to ...");
        // aby skonwertować temperaturę ze stopni Farenheita
        // na stopnie Celsjusza, rozpocznij od odjęcia 32
        fah = fah-32;
        // podziel wynik przez 9
        fah = fah/9;
        // pomnóż wynik przez 5
        fah = fah*5;

        float cel = 33;
        System.out.println(cel+ " stopnie Celsjusza to ...\n");
        System.out.println(cel + " stopni Celsjusza");
        // Aby skonwertować temperaturę ze stopni Celsjusza
        // na stopnie Farenheita, rozpocznij od pomnożenia przez 9
        cel = cel*9;
        // podziel odp przez 5
        cel = cel /5;
        //dodaj do odp 32
        cel = cel+32;
        System.out.println(cel + " stopni Farenheita");
    }
}


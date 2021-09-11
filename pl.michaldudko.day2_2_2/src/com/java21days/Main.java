package com.java21days;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int x = Integer.parseInt(JOptionPane.showInputDialog("Wprowadź pierwszą liczbę"));
	int y = Integer.parseInt(JOptionPane.showInputDialog("Wprowadź drugą liczbę"));

		JOptionPane.showMessageDialog(null,"Wynik dzielenia to: "+ (x/y) +" \tReszta z dzielenia wynosi: "+(x%y));

    }
}

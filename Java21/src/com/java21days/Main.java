package com.java21days;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, PropertyChangeListener {

    //tablica wyników rzutów kostką
    JTextField[] total = new JTextField[16];
    //    przycisk rzuć
    JButton roll;
    //liczba rzutów
    JTextField quantity;
    //zadanie robocze Swing
    DiceWorker worker;

    public Main() {
        super("Rzuczanie kostką");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 145);

        //konfiguracja górnego wiersza
        JPanel topPane = new JPanel();
        GridLayout paneGrid = new GridLayout(1, 16);
        topPane.setLayout(paneGrid);
        for (int i = 0; i < 16; i++) {
            //utworzenie pola tekstowego i etykiety
            total[i] = new JTextField("0", 4);
            JLabel label = new JLabel((i + 3) + ": ");
            //utworzenie komórki w siatce
            JPanel cell = new JPanel();
            cell.add(label);
            cell.add(total[i]);
            //dodaj komórkę do górnego wiersza
            topPane.add(cell);
        }

        //konfiguracja dolnego wiersza
        JPanel bottomPane = new JPanel();
        JLabel quantityLabel = new JLabel("Liczba rzutów: ");
        quantity = new JTextField("0", 5);
        roll = new JButton("Rzuć");
        roll.addActionListener(this);
        bottomPane.add(quantityLabel);
        bottomPane.add(quantity);
        bottomPane.add(roll);

        //konfiguracja ramki
        GridLayout frameGrid = new GridLayout(2, 1);
        setLayout(frameGrid);
        add(topPane);
        add(bottomPane);
        setVisible(true);

    }

    // odpowiedz na przycisk rzuć:

    public void actionPerformed(ActionEvent evt) {
        int timesToRoll;
        try {
            //wylącz przycisk:
            timesToRoll = Integer.parseInt(quantity.getText());
            roll.setEnabled(false);
            //skonfiguruj zadanie robocze rzucające kostką
            worker = new DiceWorker(timesToRoll);
            //dodaj się jako obiekt nasłuchujący, który będzie monitorował zadanie robocze
            worker.addPropertyChangeListener(this);
            //uruchom zadanie robocze
            worker.execute();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }

    //odpowiedz gdy zadanie robocze zakończy pracę:
    public void propertyChange(PropertyChangeEvent event) {
        try {
            //pobierz wynik rzutu kostką
            int[] result = (int[]) worker.get();
            //zapamiętaj wyniki w polach tekstowych
            for (int i = 0; i < result.length; i++) {
                total[i].setText("" + result[i]);}
            }catch(Exception except){
                System.out.println(except.getMessage());
                except.printStackTrace();
            }
        }
        public static void main(String[] args){
            new Main();
        }
    }


package com.java21days;

public class Main {

    public static void main(String[] args) {
        double investition = 14000;
        int year = 0;

	year++;
    investition = investition+investition*0.4;
    System.out.println(year+ " Rok\n" + "Inwestycja jest warta: "+investition);

	year++;
	investition=investition-15_000;
	System.out.println(year+ " Rok\n" + "Inwestycja jest warta: "+investition);

    year++;
    investition=investition+investition*0.12;
    System.out.println(year+ " Rok\n" + "Inwestycja jest warta: "+investition);
    }
}

package com.java21days;

public class Main extends Measures {

    public static void main(String[] args) {
    	Measures msr = new Measures();
			msr.height = 123;
    		msr.weight = 53;
    		msr.depth = 88;

	System.out.println("Height = "+msr.height);
	System.out.println("Weight = "+msr.weight);
	System.out.println("Depth = "+msr.depth);
    }
}

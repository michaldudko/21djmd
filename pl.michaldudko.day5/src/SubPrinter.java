class SubPrinter extends Printer {
    int z = 3;

    void printMe() {
        System.out.println("x wynosi: " + x +  ",y wynosi: " + y + ", z wynosi: " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getName());

    }

    public static void main(String[] args) {
        SubPrinter obj = new SubPrinter();
        obj.printMe();

    }

}

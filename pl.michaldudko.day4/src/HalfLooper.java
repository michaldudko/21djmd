class HalfLooper {
    public static void main(String[] args) {
        int[] denver = {1700000, 4600000, 2100000};
        int[] philadelphia = {1800000, 5000000, 2500000};
        int[] total = new int[denver.length];
        int sum = 0;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.format("Produkcja w " + (i + 2012) + ": %,d%n", total[i]);
            sum += total[i];

        }
        System.out.format("Średnia produkcja: %,d%n", (sum / denver.length));
    }
}

import java.util.StringTokenizer;

class BirthdayCheck {
    public static void main(String[] arguments) {
        StringTokenizer uro;
        String quote1 = "15/05/2015";
        uro = new StringTokenizer(quote1, "/");
        System.out.println("\nDzień: " + uro.nextToken());
        System.out.println("Miesiąc: " + uro.nextToken());
        System.out.println("Rok: " + uro.nextToken());
    }
}

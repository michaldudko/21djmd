import java.io.*;

public class ConsoleInput {
    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try (BufferedInputStream buff = new BufferedInputStream(System.in)) {

            int in;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\n') & (in != 'r')) {
                    response.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            buff.close();
            return response.toString();
        } catch (IOException exc) {
            System.out.println("Wyjątek: " + exc.getMessage());
            return null;
        }
    }

    public static void main(String[] args){
        System.out.println("\nJak się nazywasz?");
        String input = ConsoleInput.readLine();
        System.out.println("\nWitaj, "+input);
    }
}


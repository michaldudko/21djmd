import java.io.*;

public class ByteReader {
    public static void main(String[] args){
        try (
            FileInputStream file = new FileInputStream("save.gif");){
            boolean eof = false;
            int count =0;
            while (!eof){
                int input = file.read();
                System.out.print(input + " ");
                if (input==-1)
                    eof = true;
                else
                    count++;
            }
            file.close();
            System.out.println("\nOdczytywanie bajtów: "+count);
        } catch (IOException e){
            System.out.println("Błąd -- "+ e.toString());
        }
    }
}

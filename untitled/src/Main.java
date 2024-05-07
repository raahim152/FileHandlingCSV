import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("data.csv");
        String text ="Hamza butt 40 marks";

        Utility.WriteToFile(file,text);

        String line = Utility.ReadFromFile(file);
        System.out.println(line);
    }
    }

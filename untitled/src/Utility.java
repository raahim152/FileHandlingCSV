import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;

public class Utility {
    public static void WriteToFile(File file, String text){
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.newLine();
            fileWriter.write(text);

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String ReadFromFile(File file){
        String data = " ";
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String text = " ";

            while((text = reader.readLine()) != null){
                data += "\n" + text;
            }
             reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}

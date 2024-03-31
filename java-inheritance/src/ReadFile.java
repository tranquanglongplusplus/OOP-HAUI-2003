import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class ReadFile {
    public static void main(String[] args) {
        Path path = Path.of("./overload.txt");

        boolean exists = Files.exists(path);

        System.out.println("Exists " + exists);

        try (BufferedReader reader = Files.newBufferedReader(path)){

            String line = reader.readLine();

            while (line != null) {

                System.out.println("Line = " + line);

                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

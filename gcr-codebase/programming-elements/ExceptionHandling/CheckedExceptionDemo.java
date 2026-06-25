import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

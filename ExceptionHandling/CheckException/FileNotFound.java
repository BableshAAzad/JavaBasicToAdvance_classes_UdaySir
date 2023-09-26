import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

    static void read() throws FileNotFoundException {
        FileReader f = new FileReader("BableshAAzad.txt");
    }

    public static void main(String[] args) {
        try {
            read();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found...");
        }
    }
}
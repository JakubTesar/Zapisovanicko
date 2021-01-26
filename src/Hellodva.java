import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Hellodva {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("hellosvete100.txt"));

            for (int i = 0; i < 100; i++) {
                bw.write("Hello světe 100!");
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

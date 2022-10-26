import com.google.inject.Inject;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public final class ApplicationFileLog implements Application {

    @Inject
    String tag = "";

    @Override
    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt"));
            String line;
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                line = scanner.next();
                if (!tag.equals("")) {
                    writer.write(index.N + " <" + tag + ">" + line + "</" + tag + ">"+"\n");
                } else {
                    writer.write(index.N + " " + line);
                }
                writer.flush();
                index.N++;
            }
        } catch (IllegalStateException | NoSuchElementException | IOException e) {
        }
    }
}

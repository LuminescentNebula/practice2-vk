import java.util.NoSuchElementException;
import java.util.Scanner;

public final class ApplicationConsoleLog implements Application {

    @Override
    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            String line;
            while (true) {
                line = scanner.next();
                System.out.println(index.N+" "+line);
                index.N++;
            }
        } catch (IllegalStateException | NoSuchElementException e) {
        }
    }
}

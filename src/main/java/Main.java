import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(@NotNull String[] args) {

        boolean f=false;
        boolean c=false;
        String tag = "";
        for (String i: args){
            if (i.equals("-c")){
                c=true;
            } else if (i.equals("-f")) {
                f=true;
            } else {
                tag =i;
            }
        }
        Injector injector;
        if (f && c) {
            System.out.println("Console and File mode");
            injector = Guice.createInjector(new ConsoleFileModule(tag));
        } else if (f && !c) {
            System.out.println("File mode");
            injector = Guice.createInjector(new FileModule(tag));
        } else {
            System.out.println("Console mode");
            injector = Guice.createInjector(new ConsoleModule());
        }

        injector.getInstance(Application.class).waitForInput();
    }
}

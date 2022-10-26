import com.google.inject.Inject;

public interface Application {

    class index{
        static int N=0;
    }

    @Inject
    void waitForInput();
}

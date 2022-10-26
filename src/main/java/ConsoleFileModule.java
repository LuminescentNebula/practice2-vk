import com.google.inject.AbstractModule;

public final class ConsoleFileModule extends AbstractModule {

    private String tag ="";
    ConsoleFileModule(String tag){
        this.tag=tag;
    }

    @Override
    protected void configure() {
        bind(Application.class).to(ApplicationConsoleFileLog.class);
        bind(String.class).toInstance(tag);
    }
}
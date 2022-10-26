import com.google.inject.AbstractModule;

public final class ConsoleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Application.class).to(ApplicationConsoleLog.class);
    }
}
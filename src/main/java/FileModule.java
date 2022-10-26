import com.google.inject.AbstractModule;

public final class FileModule extends AbstractModule {

    private String tag ="";
    FileModule(String tag){
        this.tag=tag;
    }

    FileModule(){}

    @Override
    protected void configure() {
        bind(Application.class).to(ApplicationFileLog.class);
        bind(String.class).toInstance(tag);
    }
}
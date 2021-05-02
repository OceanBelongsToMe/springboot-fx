package org.ocean.ape;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.ocean.ape.tomato.ApeSplashScreen;
import org.ocean.ape.tomato.AppView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JavaFX App
 */
@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    @Override
    public void start(Stage stage)
        throws Exception
    {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppView.class);
//
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(LOGGER::error);

        super.start(stage);
        stage.setAlwaysOnTop(true);
//        stage.setX(Screen.getPrimary().getBounds().getMinX());
//        stage.setY(Screen.getPrimary().getBounds().getMinY());
//        stage.setWidth(Screen.getPrimary().getBounds().getWidth());
//        stage.setHeight(Screen.getPrimary().getBounds().getHeight());
    }

    public static void main(String[] args)
    {
        launch(App.class, AppView.class, new ApeSplashScreen(), args);
    }

    @Override
    public Collection<Image> loadDefaultIcons()
    {
        return new ArrayList<>();
    }
}
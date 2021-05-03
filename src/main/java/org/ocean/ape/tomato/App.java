package org.ocean.ape.tomato;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
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
    public Class<?> getSpringClass()
    {
        return App.class;
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
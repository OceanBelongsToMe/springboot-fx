package org.ocean.ape.tomato;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.ocean.ape.AppStart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JavaFX App
 */
public class App extends AbstractJavaFxApplicationSupport
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

//    @Override
//    public void start(Stage stage)
//        throws Exception
//    {
//        var javaVersion = SystemInfo.javaVersion();
//        var javafxVersion = SystemInfo.javafxVersion();
//
//        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
//        var scene = new Scene(new StackPane(label), 640, 480);
//        stage.setScene(scene);
//        super.start(stage);
//        stage.show();
//    }

    @Override
    public Class<?> getSpringClass()
    {
        return AppStart.class;
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
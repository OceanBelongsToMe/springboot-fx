package org.ocean.ape;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.ocean.ape.tomato.SystemInfo;
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
    {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(App.class, args);
    }

    @Override
    public Collection<Image> loadDefaultIcons()
    {
        return new ArrayList<>();
    }
}
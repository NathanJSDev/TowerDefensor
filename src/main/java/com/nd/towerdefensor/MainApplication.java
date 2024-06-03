package com.nd.towerdefensor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    public static Parent getStage(String loadPath) throws IOException{
        return new FXMLLoader(MainApplication.class.getResource(loadPath)).load();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(getStage("views/"));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package com.example.progettofinito.Start;


import com.example.progettofinito.FileDiSistema.DatePicker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {

    public static Stage mainStage;



    @Override
    public void start(Stage stage) throws IOException {
        DatePicker datePicker = new DatePicker();
        Thread orologio = new Thread(datePicker);
        orologio.start();
        mainStage = stage;
        Parent root;
        //FXMLLoader loader = new FXMLLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/progettogaga/SchermataLogin.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();}
}


//TODO Finire di sistemare il tutto aggiungendo i costruttori e levando i metodi show, (per dubbi guardare il codice dell'anno scorso)
//TODO in conseguenza al punto 1, aggiustare il fatto che la boundary non manda la mail, ma essa va passata alla control
//TODO aggiustare questo errore, in fase invio mail: WARNING: expected resource not found: /META-INF/javamail.default.address.map


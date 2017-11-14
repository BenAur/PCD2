package Arezzo;

import Arezzo.vue.Piano;
import Arezzo.vue.VuePartition;
import abc.midi.TunePlayer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import partition.Melodie;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Melodie melodie  = new Melodie(new TunePlayer());

        loader.setLocation(getClass().getResource("vue/principale.fxml"));
        loader.setControllerFactory(param -> {return new Piano(melodie);});
        loader.setControllerFactory(param2 -> {return new VuePartition(melodie);});
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 640,400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

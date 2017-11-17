package Arezzo;

import Arezzo.modèle.Partition2;
import abc.midi.TunePlayer;
import com.sun.media.sound.SoftInstrument;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import partition.Melodie;
import partition.Partition;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Melodie melodie  = new Melodie(new TunePlayer());
        melodie.setMelodie("");

        try {
            Synthesizer synthe = MidiSystem.getSynthesizer();
            Partition2 part = new Partition2(synthe);
            part.setMelodie("C C C ");
            part.play();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        /*loader.setLocation(getClass().getResource("vue/principale.fxml"));

        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 640,400));
        primaryStage.show();
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}

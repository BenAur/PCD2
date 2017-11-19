package Arezzo;

import Arezzo.modèle.Partition2;
import Arezzo.vue.VueBouton;
import Arezzo.vue.VuePiano;
import Arezzo.vue.VuePartition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader;
        GridPane root = new GridPane();

        //Creation du modèle
        Synthesizer synthe = MidiSystem.getSynthesizer();
        final Partition2 partition = new Partition2(synthe);;

        //Creation du VuePiano
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vuePiano.fxml"));
        loader.setControllerFactory(c -> {return new VuePiano(partition);});
        root.add(loader.load(),0,0);

        //Creation de la VuePartition
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vuePartition.fxml"));
        loader.setControllerFactory(c -> {return new VuePartition(partition);});
        root.add(loader.load(), 1, 0);

        //Creation du bouton Play
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vueBouton.fxml"));
        loader.setControllerFactory(c -> {return new VueBouton(partition);});
        root.add(loader.load(),1,1);

        primaryStage.setScene(new Scene(root, 1200,800));
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}

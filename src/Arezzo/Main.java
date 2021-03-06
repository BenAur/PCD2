package Arezzo;

import Arezzo.modele.ArrezoModel;
import Arezzo.vue.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader;
        GridPane root = new GridPane();

        //Creation du modele
        ArrezoModel model = new ArrezoModel();

        //Creation du VuePiano
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vuePiano.fxml"));
        loader.setControllerFactory(c -> new VuePiano(model));
        root.add(loader.load(),0,0);

        //Creation de la VuePartition
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vuePartition.fxml"));
        loader.setControllerFactory(c -> {return new VuePartition(model);});
        root.add(loader.load(), 1, 0);

        //Creation du bouton Play
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vueBouton.fxml"));
        loader.setControllerFactory(c -> {return new VueBouton(model);});
        root.add(loader.load(),1,1);

        //Creation de VueDureeHauteur
        loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vueDureeHauteur.fxml"));
        loader.setControllerFactory(c -> {return new VueDureeHauteur(model);});
        root.add(loader.load(),0,1);

        //Creation de VueSliders
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./vue/vueSliders.fxml"));
        loader.setControllerFactory(c -> {return new VueSliders(model);});
        root.add(loader.load(),2,1);


        primaryStage.setScene(new Scene(root, 1800,800));
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}

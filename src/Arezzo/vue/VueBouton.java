package Arezzo.vue;

import Arezzo.modèle.ArrezoModel;
import Arezzo.modèle.Partition2;
import javafx.fxml.FXML;

/**
 * Vue du bouton play
 * Created by Aurelien on 19/11/2017.
 */
public class VueBouton {
    private ArrezoModel model;

    public VueBouton(ArrezoModel model){
        this.model = model;
    }

    @FXML
    public void appuiePlay(){
        this.model.play();
    }
}

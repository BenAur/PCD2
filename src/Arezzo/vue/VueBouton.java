package Arezzo.vue;

import Arezzo.modele.ArrezoModel;
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

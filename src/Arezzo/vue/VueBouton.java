package Arezzo.vue;

import Arezzo.modèle.Partition2;
import javafx.fxml.FXML;

/**
 * Vue du bouton play
 * Created by Aurelien on 19/11/2017.
 */
public class VueBouton {
    private Partition2 partition;

    public VueBouton(Partition2 partition){
        this.partition = partition;
    }

    @FXML
    public void appuiePlay(){
        this.partition.play();
    }
}

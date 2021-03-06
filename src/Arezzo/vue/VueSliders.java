package Arezzo.vue;

import Arezzo.modele.ArrezoModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Slider;

/**
 * Vue Représentant les sliders
 * Created by Aurelien on 21/11/2017.
 */
public class VueSliders {
    private ArrezoModel model;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider tempoSlider;


    public VueSliders(ArrezoModel model){
        this.model = model;
    }

    @FXML
    public void slideVolume(){
        this.model.setVolume(this.volumeSlider.getValue());
    }

    @FXML
    public void slideTempo(){
        this.model.setTempo((int)this.tempoSlider.getValue());
    }
}


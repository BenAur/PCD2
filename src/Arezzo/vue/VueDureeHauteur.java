package Arezzo.vue;

import Arezzo.modèle.ArrezoModel;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

/**
 * Permet de gérer la hauteur et la durée de la prochaine note à ajouter
 * Created by Aurelien on 20/11/2017.
 */
public class VueDureeHauteur {

    private ArrezoModel model;

    public VueDureeHauteur(ArrezoModel model){
        this.model=model;
    }

    @FXML
    public void setGrave(){
        this.model.setHauteur(ArrezoModel.GRAVE);
    }

    @FXML
    public void setMedium(){
        this.model.setHauteur(ArrezoModel.MEDIUM);
    }

    @FXML
    public void setAigu(){
        this.model.setHauteur(ArrezoModel.AIGU);
    }

    @FXML
    public void setCroche(){
        this.model.setDurée(ArrezoModel.CROCHE);
    }

    @FXML
    public void setNoire(){
        this.model.setDurée(ArrezoModel.NOIRE);

    }

    @FXML
    public void setBlanche(){
        this.model.setDurée(ArrezoModel.BLANCHE);

    }

    @FXML
    public void setRonde(){
        this.model.setDurée(ArrezoModel.RONDE);
    }

}


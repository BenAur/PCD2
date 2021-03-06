package Arezzo.vue;


import Arezzo.modele.ArrezoModel;
import javafx.fxml.FXML;

/**
 * Contrôleur/Vue du Piano
 * Created by Aurelien on 13/11/2017.
 */
public class VuePiano {

    private ArrezoModel model;

    public VuePiano(ArrezoModel model){
        this.model = model;
    }

    @FXML
    public void appuieDo(){
        this.model.ajouterNote(ArrezoModel.DO);
    }

    @FXML
    public void appuieDoD(){
        this.model.ajouterNote("^"+ArrezoModel.DO);
    }


    @FXML
    public void appuieRe() {
        this.model.ajouterNote(ArrezoModel.RE);
    }

    @FXML
    public void appuieReD() {
        this.model.ajouterNote("^"+ArrezoModel.RE);
    }

    @FXML
    public void appuieMi() {
        this.model.ajouterNote(ArrezoModel.MI);
    }

    @FXML
    public void appuieFa(){
        this.model.ajouterNote(ArrezoModel.FA);
    }

    @FXML
    public void appuieFaD(){
        this.model.ajouterNote("^"+ArrezoModel.FA);
    }

    @FXML
    public void appuieSol(){
        this.model.ajouterNote(ArrezoModel.SOL);
    }

    @FXML
    public void appuieSolD(){
        this.model.ajouterNote("^"+ArrezoModel.SOL);
    }


    @FXML
    public void appuieLa(){
        this.model.ajouterNote(ArrezoModel.LA);
    }

    @FXML
    public void appuieLaD(){
        this.model.ajouterNote("^"+ArrezoModel.LA);
    }

    @FXML
    public void appuieSi(){
        this.model.ajouterNote(ArrezoModel.SI);
    }

    @FXML
    public void appuieSilence(){ this.model.ajouterSilence();}
}

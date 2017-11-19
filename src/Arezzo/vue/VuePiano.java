package Arezzo.vue;


import Arezzo.modèle.Partition2;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * Created by Aurelien on 13/11/2017.
 */
public class VuePiano {

    private Partition2 partition;
    private StringBuilder chaine;

    public VuePiano(Partition2 partition){
        this.partition = partition;
        partition.setMelodie("C C C ");
        partition.setMelodie("");
        chaine = new StringBuilder(800);
    }

    @FXML
    public void appuieDo(){
        chaine=chaine.append("C ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieDoD(){
        chaine=chaine.append("^C ");
        partition.setMelodie(chaine.toString());
    }


    @FXML
    public void appuieRe() {
        chaine=chaine.append("D ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieReD() {
        chaine=chaine.append("^D ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieMi(){
        chaine=chaine.append("E ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieFa(){
        chaine=chaine.append("F ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieFaD(){
        chaine=chaine.append("^F ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieSol(){
        chaine=chaine.append("G ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieSolD(){
        chaine=chaine.append("^G ");
        partition.setMelodie(chaine.toString());
    }


    @FXML
    public void appuieLa(){
        chaine=chaine.append("A ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieLaD(){
        chaine=chaine.append("^A ");
        partition.setMelodie(chaine.toString());
    }

    @FXML
    public void appuieSi(){
        chaine=chaine.append("B ");
        partition.setMelodie(chaine.toString());
    }

}

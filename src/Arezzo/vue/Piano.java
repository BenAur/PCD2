package Arezzo.vue;


import javafx.fxml.FXML;
import partition.Melodie;

/**
 * Created by Aurelien on 13/11/2017.
 */
public class Piano {

    Melodie melodie;
    String morceau;

    public Piano(Melodie melodie){
        morceau = "";
    }

    public void appuieDo(){
        morceau.concat("C"+" ");
        melodie.setMelodie(morceau);
    }

}

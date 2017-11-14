package Arezzo.modèle;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Aurelien on 14/11/2017.
 */
public class Chaine {
    final private SimpleStringProperty chaine = new SimpleStringProperty("");

    public Chaine(SimpleStringProperty a){
        setChaine("");
    }

    public void setChaine(String chaine) {
        this.chaine.set(chaine);
    }

    public String getChaine(){
        return this.chaine.get();
    }
}

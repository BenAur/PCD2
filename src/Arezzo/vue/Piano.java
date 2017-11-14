package Arezzo.vue;


import javafx.fxml.FXML;
import javafx.scene.text.Text;
import partition.Melodie;

/**
 * Created by Aurelien on 13/11/2017.
 */
public class Piano {

    @FXML private Text chaine;

    @FXML
    public void appuieDo(){
        chaine.setText(chaine.getText()+"C ");
    }

}

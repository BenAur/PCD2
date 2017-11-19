package Arezzo.vue;

import Arezzo.modèle.Partition2;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.util.Observable;
import java.util.Observer;

/**
 * Vue de la partition
 * Created by Aurelien on 13/11/2017.
 */
public class VuePartition implements Observer {

    @FXML
    private ImageView imagePartition;

    public VuePartition(Partition2 partition){
        imagePartition = new ImageView(partition.getImage());
        partition.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        assert o instanceof Partition2;
        Partition2 p = (Partition2)o;
        this.imagePartition.setImage(p.getImage());
    }
}

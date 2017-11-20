package Arezzo.modèle;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 * Interface de gestion du modèle
 * Created by Aurelien on 20/11/2017.
 */
public class ArrezoModel {
    private Partition2 partition;
    private StringBuilder melodieActuelle;
    private int hauteur;
    private int durée;

    public static final int AIGU=3;
    public static final int MEDIUM=2;
    public static final int GRAVE=1;

    public static final int CROCHE=0;
    public static final int NOIRE=1;
    public static final int BLANCHE=2;
    public static final int RONDE=4;

    public static String DO="C";
    public static String RE="D";
    public static String MI="E";
    public static String FA="F";
    public static String SOL="G";
    public static String LA="A";
    public static String SI="B";

    public ArrezoModel() throws MidiUnavailableException {
        Synthesizer synthe = MidiSystem.getSynthesizer();
        this.partition = new Partition2(synthe);
        this.partition.setMelodie("");
        this.partition.setPreferedMaxWidth(600);
        this.partition.setTempo(120);
        this.partition.setTitre("HEY");
        this.melodieActuelle = new StringBuilder(800);
        this.hauteur=ArrezoModel.MEDIUM;
        this.durée=ArrezoModel.NOIRE;
    }

    public void ajouterNote(String note){
        switch(this.hauteur){
            case ArrezoModel.GRAVE :
                melodieActuelle.append(note).append(",");
                break;
            case ArrezoModel.MEDIUM :
                melodieActuelle.append(note);
                break;
            case ArrezoModel.AIGU :
                melodieActuelle.append(note.toLowerCase());
                break;
        }
        switch (this.durée){
            case ArrezoModel.CROCHE :
                melodieActuelle.append("/");
                break;
            case ArrezoModel.NOIRE :
                melodieActuelle.append("");
                break;
            case ArrezoModel.BLANCHE :
                melodieActuelle.append("2");
                break;
            case ArrezoModel.RONDE :
                melodieActuelle.append("4");
                break;
        }
        melodieActuelle.append(" ");
        this.partition.setMelodie(melodieActuelle.toString());
    }

    public void setHauteur(int h){
        this.hauteur = h;
    }

    public void setDurée(int d){
        this.durée = d;
    }

    public void play(){
        this.partition.play();
    }

    public Partition2 getPartition(){
        return this.partition;
    }
}

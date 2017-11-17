package Arezzo.modèle;

import abc.midi.TunePlayer;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import partition.*;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 * Cree par Aurelien Benoit le 17/11/2017.
 * Version simplifiee de la gestion de Partition, utile car la HashMap bug sous Windows (?!)
 * Inspiree de la classe Partition de l'archive partition.jar fournie par TELECOM Nancy
 */
public class Partition2 {

    protected PartitionAbstraite melodie;
    protected PartitionAbstraite uneNote;
    protected TunePlayer player;
    protected Synthesizer synthe;

    public Partition2(Synthesizer synthesizer) {
        this.synthe = synthesizer;
        this.player = new TunePlayer();
        this.player.start();

        this.melodie = new Melodie(this.player);
        this.uneNote = new UneNote(this.player);
        try {
            this.player.setInstrument(this.synthe.getAvailableInstruments()[0]);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setMelodie(String m) {
        this.melodie.setMelodie(m);
    }

    public void setMelodieNotationAbcComplete(String m) {
        this.melodie.setMelodieNotationAbcComplete(m);
    }

    public void setPreferedMaxWidth(int w) {
        this.melodie.setPreferedMaxWidth(w);
    }

    public Image getImage() {
        return this.melodie.getImage();
    }

    public void setTitre(String t) {
        this.melodie.setTitre(t);
    }

    public String getTitre() {
        return this.melodie.getTitre();
    }

    public void play() {
        this.melodie.play();
    }

    public void play(String note) {
        this.uneNote.setMelodie(note);
        this.uneNote.play();
    }

    public void setTempo(int t) {
        this.player.setTempo(t);
    }

    public void setVolume(double volume) {
        Audio.setMasterOutputVolume((float)(volume / 100.0D));
    }

    public void setCouleurs(Color colorFx, int... tab) {
        java.awt.Color awtColor = new java.awt.Color((float)colorFx.getRed(), (float)colorFx.getGreen(), (float)colorFx.getBlue(), (float)colorFx.getOpacity());
        this.melodie.setCouleurs(awtColor, tab);
    }

    public void close() {
        this.player.stop();
        this.synthe.close();
    }

    public String toString() {
        return this.melodie.toString();
    }

}

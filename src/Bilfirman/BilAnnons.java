package Bilfirman;

/**
 * Created by Sara Carlsson
 * Date: 22/09/2020
 * Time:20:58
 * Project: Lektion 2
 * Copywright: MIT
 */
public class BilAnnons extends FordonsAnnons{
    private String färg;
    private String sommardäck;
    private String vinterdäck;

    public BilAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil,
                          String färg, String sommardäck, String vinterdäck){
        super(pris,rubrik, beskrivning, årsmodell, antalMil);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    public String getFärg() {
        return this.färg;
    }


    public String getSommardäck() {
        return this.sommardäck;
    }

    public String getVinterdäck() {
        return this.vinterdäck;
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf(getRubrik() + "\nPris: \t\t%,dkr\nÅrsmodell:\t" + getÅrsmodell() + "\nAntal mil:\t%,d mil" +
                    "\nFärg:\t\t" + getFärg() + "\nSommardäck:\t" + getSommardäck() + "\nVinterdäck:\t" +
                    getVinterdäck() + "\n" + getBeskrivning() + "\n", getPris(),getAntalMil());
    }
}

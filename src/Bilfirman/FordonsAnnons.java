package Bilfirman;


import org.w3c.dom.ls.LSOutput;

/**
 * Created by Sara Carlsson
 * Date: 22/09/2020
 * Time:19:15
 * Project: Lektion 2
 * Copywright: MIT
 */
abstract class FordonsAnnons implements IPublishable,Revenuable {
    private int pris;
    private String rubrik;
    private String beskrivning;
    private int årsmodell;
    private int antalMil;
    //abstract public void getAnnonsText(); Gammal utskriftsmetod

    public FordonsAnnons(){}

    public FordonsAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil){
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }

    public int getPris() {
        return this.pris;
    }

    public String getRubrik() {
        return this.rubrik;
    }
    public String getBeskrivning(){
        return this.beskrivning;
    }

    public int getÅrsmodell() {
        return this.årsmodell;
    }

    public int getAntalMil() {
        return this.antalMil;
    }

    @Override
    public void PrintHeader() {
        System.out.printf(getRubrik().toUpperCase() + " %,dkr\n", getPris());
    }

    @Override
    public void calculateRevenue() {
        Double d = getPris()/1.25;
        System.out.printf("Pris exkl. moms: %,.0fkr\n",  d );
    }

}

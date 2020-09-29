package Bilfirman;

/**
 * Created by Sara Carlsson
 * Date: 22/09/2020
 * Time:21:08
 * Project: Lektion 2
 * Copywright: MIT
 */
public class HusvagnsAnnons extends FordonsAnnons{
    private int sängplatser;
    private boolean dusch;

    public HusvagnsAnnons(int pris, String rubrik, String beskrivning,int årsmodell,int antalMil,
                          int sängplatser, boolean dusch){
        super(pris,rubrik, beskrivning, årsmodell, antalMil);
        this.sängplatser = sängplatser;
        this.dusch = dusch;
    }

    public int getSängplatser() {
        return this.sängplatser;
    }

    public String getDusch(boolean dusch) {
        if (dusch==true)
            return "Ja";
        else
            return "Nej";
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf(getRubrik() + "\nPris:\t\t%,dkr\nÅrsmodell:\t" + getÅrsmodell() + "\nAntal mil:\t%,d mil" +
                "\nSovplatser:\t" + getSängplatser() + "\nDusch:\t\t" + getDusch(this.dusch) + "\n" +
                getBeskrivning() + "\n",getPris(), getAntalMil());
    }
}

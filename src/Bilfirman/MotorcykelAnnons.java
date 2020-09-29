package Bilfirman;

/**
 * Created by Sara Carlsson
 * Date: 23/09/2020
 * Time:13:21
 * Project: Lektion 2
 * Copywright: MIT
 */
public class MotorcykelAnnons extends FordonsAnnons {
    private int motorvolym;
    private String drivrutin;

    public MotorcykelAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil,
                            int motorvolym, String drivrutin){
        super(pris, rubrik, beskrivning, årsmodell, antalMil);
        this.motorvolym = motorvolym;
        this.drivrutin = drivrutin;
    }

    public int getMotorvolym() {
        return this.motorvolym;
    }

    public String getDrivrutin() {
        return this.drivrutin;
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf(getRubrik() + "\nPris:\t\t%,dkr \nÅrsmodell:\t" + getÅrsmodell() + "\nAntal mil:\t%,d mil" +
                "\nMotorvolym:\t" + getMotorvolym() + "\nDrivrutin:\t" + getDrivrutin() + "\n" + getBeskrivning()
                + "\n", getPris(),getAntalMil());
    }

    @Override
    public void calculateRevenue() {
        Double d = (getPris()*0.9)/1.25;
        System.out.printf("Pris exkl. moms och rabatt: %,.0fkr" ,  d );
    }
}

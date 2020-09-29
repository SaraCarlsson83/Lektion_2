package Bilfirman;

/**
 * Created by Sara Carlsson
 * Date: 23/09/2020
 * Time:13:52
 * Project: Lektion 2
 * Copywright: MIT
 */
public class Demo{
    //public void printAnnons (FordonsAnnons text){text.getAnnonsText();} Gammal utskiftsmetod
    public void printAll(IPublishable text){text.PrintCompleteAd();}
    public void header(IPublishable text){text.PrintHeader();}
    public void price(Revenuable text){text.calculateRevenue();}

    public Demo(){
        BilAnnons bil1 = new BilAnnons(25000, "Volvo V40", "Fin och härlig bil att köra!",
                2001, 14000, "Röd", "Ja", "Nej");
        BilAnnons bil2 = new BilAnnons(2500000, "Ny Tesla", "Köp köp!!", 2020, 2000, "Silver",
                "ja", "ja");
        HusvagnsAnnons husvagn1 = new HusvagnsAnnons(120000, "Bra husvagn",
                "Bästa husvagnen, köp den!!", 1998, 15000, 5, false);
        MotorcykelAnnons motorcykel1 = new MotorcykelAnnons(250000, "BMW i bra skick",
                "Lättkörd och pålitlig motorcykel.", 2015, 5000, 500, "vet ej");

        System.out.println();
        header(bil1);
        header(bil2);
        header(husvagn1);
        header(motorcykel1);
        System.out.println();

        printAll(bil1);
        price(bil1);
        System.out.println();

        printAll(bil2);
        price(bil2);
        System.out.println();

        printAll(husvagn1);
        price(husvagn1);
        System.out.println();

        printAll(motorcykel1);
        price(motorcykel1);
        System.out.println();
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
    }
}

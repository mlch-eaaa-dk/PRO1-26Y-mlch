package storage;

import model.Juletræ;
import model.JuletræsGrossist;
import model.Salg;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<JuletræsGrossist> juletræsGrossister = new ArrayList<>();
    private static final ArrayList<Juletræ> juletræer = new ArrayList<>();
    private static final ArrayList<Salg> salgsliste = new ArrayList<>();
    
    public static ArrayList<JuletræsGrossist> getJuletræsGrossister() {
        return juletræsGrossister;
    }
    
    public static ArrayList<Juletræ> getJuletræer() {
        return juletræer;
    }

    public static ArrayList<Salg> getSalgsliste() {
        return salgsliste;
    }
    
    public static void gemJuletræsGrossist(JuletræsGrossist juletræsGrossist) {
        juletræsGrossister.add(juletræsGrossist);
    }

    public static void gemJuletræ(Juletræ juletræ) {
        juletræer.add(juletræ);
    }

    public static void gemSalg(Salg salg) {
        salgsliste.add(salg);
    }

    public static void sletJuletræsGrossist(JuletræsGrossist juletræsGrossist) {
        juletræsGrossister.remove(juletræsGrossist);
    }

    public static void sletJuletræ(Juletræ juletræ) {
        juletræer.remove(juletræ);
    }

    public static void sletSalg(Salg salg) {
        salgsliste.remove(salg);
    }
}

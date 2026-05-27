package model;

import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class JuletræsGrossist {
    private String navn;
    private String cvr;
    private double fragtPrisPrPalle;

    // link JuletræsGrossist --> 0..* Juletræ
    private final ArrayList<Juletræ> juletræer = new ArrayList<>();

    public JuletræsGrossist(String navn, String cvr, double fragtPrisPrPalle) {
        this.navn = navn;
        this.cvr = cvr;
        this.fragtPrisPrPalle = fragtPrisPrPalle;
    }

    public String getNavn() {
        return navn;
    }

    public String getCvr() {
        return cvr;
    }

    public double getFragtPrisPrPalle() {
        return fragtPrisPrPalle;
    }

    @Override
    public String toString() {
        return navn;
    }

    //-----------------------------------------------------

    public ArrayList<Juletræ> getJuletræer() {
        return juletræer;
    }

    public void addJuletræ( Juletræ juletræ) {
        juletræer.add(juletræ);
    }

    public void removeJuletræ( Juletræ juletræ) {
        juletræer.remove(juletræ);
    }
}


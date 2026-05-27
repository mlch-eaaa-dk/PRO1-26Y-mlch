package model;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class Salgslinje {
    private int antal;
    private double aftaltRabatPrTræ;

    // link Salgslinje --> 1 Juletræ
    private Juletræ juletræ;
    // link Salgslinje --> 1 Salg
    private Salg salg;

    public Salgslinje(int antal, double aftaltRabatPrTræ, Juletræ juletræ, Salg salg) {
        this.antal = antal;
        this.aftaltRabatPrTræ = aftaltRabatPrTræ;
        this.juletræ = juletræ;
        this.salg = salg;
    }

    public int getAntal() {
        return antal;
    }

    public double getAftaltRabatPrTræ() {
        return aftaltRabatPrTræ;
    }

    //-----------------------------------------------------

    public Juletræ getJuletræ() {
        return juletræ;
    }

    public void setJuletræ(Juletræ juletræ) {
        this.juletræ = juletræ;
    }

    public Salg getSalg() {
        return salg;
    }

    // ingen setSalg i komposition

    //-----------------------------------------------------

    // S5
    public double getSalgslinjePris() {
        return (juletræ.prisPåDato(salg.getSalgsDato()) - aftaltRabatPrTræ) * antal;
    }


}

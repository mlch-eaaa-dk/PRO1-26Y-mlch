package model;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Juletræ implements Comparable<Juletræ> {
    private Sort sort;
    private int højde;
    private int antalPrPalle;

    // link Juletræ --> 0..1 JuletræsGrossist
    private @Nullable JuletræsGrossist juletræsGrossist;
    // link Juletræ --> 0..* PeriodePris
    private final ArrayList<PeriodePris> periodePriser = new ArrayList<>();

    public Juletræ(Sort sort, int højde, int antalPrPalle) {
        this.sort = sort;
        this.højde = højde;
        this.antalPrPalle = antalPrPalle;
    }

    public Sort getSort() {
        return sort;
    }

    public int getHøjde() {
        return højde;
    }

    public int getAntalPrPalle() {
        return antalPrPalle;
    }

    //-----------------------------------------------------

    public @Nullable JuletræsGrossist getJuletræsGrossist() {
        return juletræsGrossist;
    }

    public void setJuletræsGrossist(@Nullable JuletræsGrossist juletræsGrossist) {
        this.juletræsGrossist = juletræsGrossist;
    }

    public ArrayList<PeriodePris> getPeriodePriser() {
        return periodePriser;
    }

    public void addPeriodePris(PeriodePris periodePris) {
        periodePriser.add(periodePris);
    }

    public void removePeriodePris(PeriodePris periodePris) {
        periodePriser.remove(periodePris);
    }

    @Override
    public String toString() {
        return sort + " " + højde + " cm, Maks " + antalPrPalle + " på en palle";
    }

    //-----------------------------------------------------

    // S4
    public double prisPåDato(LocalDate salgsDato) {
        double pris = -1;
        for (int i = 0; pris == -1 && i < periodePriser.size(); i++) {
            PeriodePris periodePris = periodePriser.get(i);
            if (periodePris.getFraDato().compareTo(salgsDato) <= 0 &&
                    salgsDato.compareTo(periodePris.getTilDato()) <= 0
            ) {
                pris = periodePris.getPris();
            }
        }
        if (pris == -1) {
            throw new RuntimeException("Ingen pris fundet på den givne slagsdato");
        } else {
            return pris;
        }
    }

    // S9 del
    @Override
    public int compareTo(Juletræ o) {
        return Integer.compare(this.højde, o.højde);
    }
}


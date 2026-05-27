package model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

@NullMarked
public class Salg {
    private String kunde;
    private LocalDate salgsDato;

    // link Salg --> 0..* Salgslinje
    private final ArrayList<Salgslinje> salgslinjer = new ArrayList<>();

    public Salg(String kunde, LocalDate salgsDato) {
        this.kunde = kunde;
        this.salgsDato = salgsDato;
    }

    public String getKunde() {
        return kunde;
    }

    public LocalDate getSalgsDato() {
        return salgsDato;
    }

    //-----------------------------------------------------

    public ArrayList<Salgslinje> getSalgslinjer() {
        return salgslinjer;
    }

    public void addSalgslinje(Salgslinje salgslinje) {
        salgslinjer.add(salgslinje);
    }

    public void removeSalgslinje(Salgslinje salgslinje) {
        salgslinjer.remove(salgslinje);
    }

    //-----------------------------------------------------

    // S6
    public double prisEksklusivFragt() {
        double pris = 0;
        for (Salgslinje salgslinje : salgslinjer) {
            pris += salgslinje.getSalgslinjePris();
        }
        return pris;
    }

    // S7
    /** Alle salgslinjers juletræ har en juletræsgrossist tilknyttet. */
    public double prisInklusivFragt() {
        double pris = 0;
        for (Salgslinje salgslinje : salgslinjer) {
            pris += salgslinje.getSalgslinjePris();
            int antalPaller = salgslinje.getAntal() / salgslinje.getJuletræ().getAntalPrPalle();
            if (salgslinje.getAntal() % salgslinje.getJuletræ().getAntalPrPalle() != 0) {
                antalPaller++;
            }
            JuletræsGrossist juletræsGrossist =
                    Objects.requireNonNull(salgslinje.getJuletræ().getJuletræsGrossist());
            pris += antalPaller * juletræsGrossist.getFragtPrisPrPalle();
        }
        return  pris;
    }
}

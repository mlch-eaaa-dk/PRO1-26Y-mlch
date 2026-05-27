package controller;

import model.*;
import storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Controller {

    public static JuletræsGrossist opretJuletræsGrossist(String navn, String cpr, double fragtPrisPrPalle) {
        JuletræsGrossist juletræsGrossist = new JuletræsGrossist(navn, cpr, fragtPrisPrPalle);
        Storage.gemJuletræsGrossist(juletræsGrossist);
        return juletræsGrossist;
    }

    public static Juletræ opretJuletræ(Sort sort, int højde, int antalPrPalle) {
        Juletræ juletræ = new Juletræ(sort, højde, antalPrPalle);
        Storage.gemJuletræ(juletræ);
        return juletræ;
    }

    public static Salg opretSalg(String kunde, LocalDate salgsDato) {
        Salg salg = new Salg(kunde, salgsDato);
        Storage.gemSalg(salg);
        return salg;
    }

    public static PeriodePris opretPeriodePris(LocalDate fraDato, LocalDate tilDato, double pris, Juletræ juletræ) {
        PeriodePris periodePris = new PeriodePris(fraDato, tilDato, pris);
        juletræ.addPeriodePris(periodePris);
        return periodePris;
    }

    public static Salgslinje opretSalgslinje(int antal, double aftaltRabatPrTræ, Juletræ juletræ, Salg salg) {
        Salgslinje salgslinje = new Salgslinje(antal, aftaltRabatPrTræ, juletræ, salg);
        salg.addSalgslinje(salgslinje);
        return salgslinje;
    }

    /** Juletræet har ikke en JuletræsGrossist. */
    public static void setJuletræsGrossistForJuletræ(Juletræ Juletræ, JuletræsGrossist juletræsGrossist) {
        Juletræ.setJuletræsGrossist(juletræsGrossist);
        juletræsGrossist.addJuletræ(Juletræ);
    }

    // S8

    /** Note: Alle juletræer har en tilknyttet juletræsgrossist. */
    public static void udskrivInfoOmJuletræer(String filnavn) {
        File file = new File(filnavn);
        try (PrintWriter writer = new PrintWriter(file)) {
            for (Juletræ juletræ : Storage.getJuletræer()) {
                JuletræsGrossist juletræsGrossist = Objects.requireNonNull(juletræ.getJuletræsGrossist());
                for (PeriodePris periodePris : juletræ.getPeriodePriser()) {
                    String info = String.format("%-31s %13s %7d cm       %s - %s %10.2f kr.",
                            juletræsGrossist.getNavn(),
                            juletræ.getSort(), juletræ.getHøjde(),
                            periodePris.getFraDato(), periodePris.getTilDato(), periodePris.getPris());
                    writer.println(info);
                    IO.println(info);
                }
            }
        } catch (FileNotFoundException e) {
            IO.println(e);
        }
    }

    // S9
    /** Alle juletræer har en tilknyttet juletræsgrossist. */
    public static ArrayList<String> oversigtOverJuletræer() {
        ArrayList<String> oversigt = new ArrayList<>();
        for (Juletræ juletræ : Storage.getJuletræer()) {
            JuletræsGrossist juletræsGrossist = Objects.requireNonNull(juletræ.getJuletræsGrossist());
            oversigt.add(juletræ.getHøjde() + " " + juletræ.getSort() + " " + juletræ.getJuletræsGrossist());
        }
        Collections.sort(oversigt);
        return oversigt;
    }
}

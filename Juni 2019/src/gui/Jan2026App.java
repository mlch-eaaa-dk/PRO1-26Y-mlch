package gui;

import controller.Controller;
import javafx.application.Application;
import model.Juletræ;
import model.JuletræsGrossist;
import model.Salg;
import model.Sort;

import java.time.LocalDate;

import static controller.Controller.*;

public class Jan2026App {
    void main() {
        initStorage();
        Application.launch(Jan2026Gui.class);
    }

    private void initStorage() {
        JuletræsGrossist hammel = opretJuletræsGrossist("Hammel Juletræer", "2316", 150);
        JuletræsGrossist sommersminde = opretJuletræsGrossist("Sommersminde juleræsplantage", "34342", 140);

        Juletræ træ1 = opretJuletræ(Sort.NORDMANNSGRAN, 200, 100);
        setJuletræsGrossistForJuletræ(træ1, hammel);
        opretPeriodePris(LocalDate.parse("2025-11-01"), LocalDate.parse("2025-11-30"), 50, træ1);
        opretPeriodePris(LocalDate.parse("2025-12-01"), LocalDate.parse("2025-12-24"), 100, træ1);

        Juletræ træ2 = opretJuletræ(Sort.RØDGRAN, 170, 140);
        setJuletræsGrossistForJuletræ(træ2, hammel);
        opretPeriodePris(LocalDate.parse("2025-11-01"), LocalDate.parse("2025-11-30"), 40, træ2);
        opretPeriodePris(LocalDate.parse("2025-12-01"), LocalDate.parse("2025-12-24"), 80, træ2);

        Juletræ træ3 = opretJuletræ(Sort.NOBILIS, 170, 140);
        setJuletræsGrossistForJuletræ(træ3, sommersminde);
        opretPeriodePris(LocalDate.parse("2025-11-01"), LocalDate.parse("2025-11-30"), 40, træ3);
        opretPeriodePris(LocalDate.parse("2025-12-01"), LocalDate.parse("2025-12-24"), 60, træ3);

        Juletræ træ4 = opretJuletræ(Sort.NORDMANNSGRAN, 160, 144);
        setJuletræsGrossistForJuletræ(træ4, sommersminde);
        opretPeriodePris(LocalDate.parse("2025-11-01"), LocalDate.parse("2025-11-30"), 60, træ4);
        opretPeriodePris(LocalDate.parse("2025-12-01"), LocalDate.parse("2025-12-24"), 75, træ4);

        Salg fdf = opretSalg("FDF Viby", LocalDate.parse("2025-11-02"));
        opretSalgslinje(333, 5, træ1, fdf);
        opretSalgslinje(250, 3, træ2, fdf);

        // Test
        Controller.udskrivInfoOmJuletræer("Jan 2026/src/controller/InfoOmJuletræer.txt");
    }
}

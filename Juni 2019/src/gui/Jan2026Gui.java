package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Juletræ;
import model.JuletræsGrossist;
import storage.Storage;

import java.time.LocalDate;

public class Jan2026Gui extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Juletræsgrossist");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<JuletræsGrossist> lvwJuletræsGrossister = new ListView<>();
    private final ListView<Juletræ> lvwJuletræer = new ListView<>();
    private final TextField txfDato = new TextField("2025-12-12");
    private final TextField txfPris = new TextField();
    private final TextArea txaSorteredeJuletræer = new TextArea();

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Jultræsgrossister"), 0, 0);

        pane.add(lvwJuletræsGrossister, 0, 1);
        lvwJuletræsGrossister.setPrefHeight(200);
        lvwJuletræsGrossister.setPrefWidth(400);
        lvwJuletræsGrossister.getItems().setAll(Storage.getJuletræsGrossister());
        lvwJuletræsGrossister.getSelectionModel().selectedItemProperty().addListener(
                (_, _, _) -> selectedJuletræsGrossist()
        );

        Button btnSorteredeJuletræer = new Button("Alle juletræer sorteret efter højde");
        pane.add(btnSorteredeJuletræer, 0, 3);
        btnSorteredeJuletræer.setOnAction(_ -> visSorteredeJuletræerAction());

        pane.add(txaSorteredeJuletræer, 0, 4);

        // column 1
        pane.add(new Label("Juletræer"), 1, 0);

        pane.add(lvwJuletræer, 1, 1);
        lvwJuletræer.setPrefHeight(200);
        lvwJuletræer.setPrefWidth(400);

        Button btnPrisPåDato = new Button("Pris på dato");
        btnPrisPåDato.setOnAction(_ -> prisPåDatoAction());

        txfPris.setEditable(false);
        txfPris.setPrefWidth(100);

        HBox hbox = new HBox(10, btnPrisPåDato, txfDato, txfPris);
        pane.add(hbox, 1, 2);

    }

    private void selectedJuletræsGrossist() {
        JuletræsGrossist selectedJuletræsGrossist = lvwJuletræsGrossister.getSelectionModel().getSelectedItem();
        if (selectedJuletræsGrossist != null) {
            lvwJuletræer.getItems().setAll(selectedJuletræsGrossist.getJuletræer());
        }
    }

    private void prisPåDatoAction() {
        Juletræ selectedJuletræ = lvwJuletræer.getSelectionModel().getSelectedItem();
        LocalDate dato = LocalDate.parse(txfDato.getText().trim());
        if (selectedJuletræ != null) {
            txfPris.setText(String.format("%.2f", selectedJuletræ.prisPåDato(dato)) + " kr");
        }
    }

    private void visSorteredeJuletræerAction() {
        for (String info : Controller.oversigtOverJuletræer()) {
            txaSorteredeJuletræer.appendText(info + "\n");
        }
    }
}

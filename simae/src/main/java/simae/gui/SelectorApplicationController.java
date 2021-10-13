package simae.gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import simae.lib.Simae;

import java.io.File;
import java.util.List;


public class SelectorApplicationController {

    private List<File> archivos = null;

    @FXML
    private ComboBox seleccionLenguajes;

    @FXML
    private ListView<?> listaDeArchivos;

    @FXML
    private Button botonMarcar;

    @FXML
    private Button botonQuitar;

    @FXML
    private Button botonDesmarcar;

    @FXML
    private void initialize() {
        seleccionLenguajes.getItems().addAll("C++", "Java", "Python");
    }

    private ObservableList l = FXCollections.observableArrayList();

    @FXML
    void multiFileChooser() {
        FileChooser fc = new FileChooser();
        archivos = fc.showOpenMultipleDialog(null);
        archivos.forEach(file -> l.add(file.getName()));
        listaDeArchivos.setItems(l);
        if (archivos.size() != 0);
        habilitarMarcado();
    }

    @FXML
    void marcaArchivos() {
        Simae simae = new Simae();
        System.out.println("pasando: " + seleccionLenguajes.getValue().toString());
        archivos.parallelStream().forEach(file -> simae.marcaPorArchivos(file, file.toString(), seleccionLenguajes.getValue().toString()));
    }

    private void habilitarMarcado() {
        botonMarcar.setDisable(false);
        botonQuitar.setDisable(false);
        botonDesmarcar.setDisable(false);
    }
}

package simae.gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;


public class SelectorApplicationController {

    @FXML
    private ListView<?> listaDeArchivos;

    private ObservableList l = FXCollections.observableArrayList();

    @FXML
    void multiFileChooser() {
        FileChooser fc = new FileChooser();
        List<File> archivos = fc.showOpenMultipleDialog(null);
        archivos.forEach(file -> l.add(file));
        listaDeArchivos.setItems(l);
    }
}

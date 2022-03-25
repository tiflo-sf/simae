package simae.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import simae.lib.Lenguaje;
import simae.lib.Simae;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;


public class SelectorApplicationController {

    private List<File> archivos = null;
    private List<Archivo> listaArchivosObjeto;

    @FXML
    private CheckBox soloQuitaMarcas;

    @FXML
    private ComboBox seleccionLenguajes;

    @FXML
    private ListView<?> listaDeArchivos;

    private List<String> listaCompleta;

    @FXML
    private Button botonMarcar;

    @FXML
    private Button botonQuitar;

    @FXML
    private Button botonQuitarSeleccion;

    @FXML
    private Text textoProcesado;

    @FXML
    private Text textoError;

    private ObservableList listaObservable = FXCollections.observableArrayList();

    private FileChooser fc = new FileChooser();

    private String extension() {
        switch (seleccionLenguajes.getSelectionModel().getSelectedItem().toString()) {
            case "C++":
                return ".cpp";
            case "Java":
                return ".java";
            case "Python3":
                return ".py";
        }
        return null;
    }

    private String lenguaje(String extension) {
        switch (extension) {
            case ".cpp":
                return "C++";
            case ".java":
                return "Java";
            case ".py":
                return "Python3";
        }
        return null;
    }

    private void eliminaOtrosLenguajes() {
        for (int i = 0; i < listaObservable.size(); i++) {
            Archivo archivo = (Archivo) listaObservable.get(i);
            String nombreArchivo = archivo.toString();
            if (!nombreArchivo.substring(nombreArchivo.lastIndexOf(".")).equals(extension())) {
                listaObservable.remove(i);
                i--;
            }
        }
    }

    @FXML
    private void initialize() {
        listaArchivosObjeto = new ArrayList<>();
        listaCompleta = new ArrayList<>();
        seleccionLenguajes.getItems().addAll(Lenguaje.CPLUSPLUS, Lenguaje.JAVA8, Lenguaje.PYTHON3, "Determinar según extensión del archivo");
        seleccionLenguajes.getSelectionModel().select(0);
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("C++ (.cpp)", "*.cpp"));
    }


    @FXML
    void multiFileChooser() {
        archivos = fc.showOpenMultipleDialog(null);
        if(archivos != null) {
            archivos.stream()
                    .filter(file -> !listaArchivosObjeto.stream().anyMatch(archivo -> file.equals(archivo.getFile()))) //FIXME: sobreescribir equals y usar contains
                    .forEach(file -> listaArchivosObjeto.add(new Archivo(file)));
            /*archivos.stream()
                            .filter(file -> !listaObservable.stream().anyMatch(archivo -> file.equals(((Archivo) (archivo)).getFile()))) //FIXME: convertir ObservableList a tipo Archivo
                            .forEach(file -> listaObservable.add(new Archivo(file)));
            archivos.stream()
                            .filter(file -> !listaObservable.contains(file.getName()))
                            .forEach(file -> listaObservable.add(file.getName()));
            */
            actualizaLista();
        }
    }

    @FXML
    void multiFolderChooser() throws IOException {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(null);
        if (selectedDirectory == null) {
            System.out.println("No seleccinó ninguna carpeta");
        } else {
            Path dir = selectedDirectory.toPath();
            Files.find(dir, Integer.MAX_VALUE, (path, attributes) ->
                    path.getFileName().toString().toLowerCase().endsWith(extension()))
                    .forEach(file -> listaArchivosObjeto.add(new Archivo(file.toFile())));
            actualizaLista();
        }
    }

    private void actualizaLista() {
        listaObservable.addAll(listaArchivosObjeto
                .stream()
                .filter(file -> !listaObservable.contains(file))
                .toArray());
        listaDeArchivos.setItems(listaObservable);
        if (extension() != null) eliminaOtrosLenguajes();
        habilitarMarcado();
    }

    @FXML
    void marcaArchivos() {
        Simae simae = new Simae();
        char decideMarca = soloQuitaMarcas.isSelected() ? 'D' : 'M'; //FIXME: intentar cambiar metodo
        //if (extension() != null) archivos.parallelStream().forEach(file -> simae.marcaDesmarcaPorArchivos(file, file.toString(), seleccionLenguajes.getValue().toString(), decideMarca));

        textoError.setVisible(false);
        textoProcesado.setVisible(false);

        if (listaObservable.parallelStream()
                .anyMatch(file -> !simae.marcaDesmarcaPorArchivos(((Archivo)file).getFile(), ((Archivo)file).getFile().toString(), lenguaje(file.toString().substring(file.toString().lastIndexOf("."))), decideMarca))) textoError.setVisible(true);

        if (!textoError.isVisible()) textoProcesado.setVisible(true);

        /*for (File file : archivos) {
            System.out.println(file.toString().substring(file.toString().lastIndexOf(".")));
            simae.marcaDesmarcaPorArchivos(file, file.toString(), lenguaje(file.toString().substring(file.toString().lastIndexOf("."))), decideMarca);
        }*/
        //archivos.parallelStream().forEach(file -> simae.marcaDesmarcaPorArchivos(file, file.toString(), lenguaje(file.toString().substring(file.toString().lastIndexOf("."))), decideMarca));

    }

    @FXML
    void filtraObjeto() {
        actualizaLista();
        if(fc.getExtensionFilters().size() != 0) fc.getExtensionFilters().removeAll(fc.getExtensionFilters());
        switch(seleccionLenguajes.getSelectionModel().getSelectedItem().toString()) {
            case "C++":
                fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("C++ (.cpp)", "*.cpp"));
                break;
            case "Java":
                fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Java (.java)", "*.java"));
                break;
            case "Python3":
                fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Python (.py)", "*.py"));
            default:
                fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("C++ (.cpp)", "*.cpp"), new FileChooser.ExtensionFilter("Java (.java)", "*.java"), new FileChooser.ExtensionFilter("Python (.py)", "*.py"), new FileChooser.ExtensionFilter("Todos (.*)", "*.cpp", "*.java", "*.py"));
        }
    }

    @FXML
    void eliminarTodos() {
        listaObservable.removeAll(listaObservable);
        listaCompleta.removeAll(listaCompleta);
    }

    @FXML
    void eliminarArchivoSeleccionado() {
        listaObservable.removeAll(listaDeArchivos.getSelectionModel().getSelectedItems());
        listaCompleta.removeAll(listaDeArchivos.getSelectionModel().getSelectedItems());
        detectaHabilitaQuitado();
    }

    @FXML
    void detectaHabilitaQuitado() {
        botonQuitarSeleccion.setDisable(listaDeArchivos.getSelectionModel().getSelectedItems().size() == 0);
    }

    private void habilitarMarcado() {
        botonMarcar.setDisable(false);
        botonQuitar.setDisable(false);
    }

}

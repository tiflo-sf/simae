package simae.gui;

import java.io.File;

public class Archivo {
    private File file;

    public Archivo(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return file.getName();
    }

    public File getFile() {
        return file;
    }
}

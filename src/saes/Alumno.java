package saes;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String boleta;
    private String nombre;
    private boolean regular;
    private List<Solicitud> solicitudes;

    public Alumno(String nombre, String boleta, boolean regular) {
        this.nombre = nombre;
        this.boleta = boleta;
        this.regular = regular;
        solicitudes = new ArrayList<Solicitud>();
    }

    public Alumno(String nombre, String boleta) {
        this.nombre = nombre;
        this.boleta = boleta;
        solicitudes = new ArrayList<Solicitud>();
    }

    public String getBoleta(String boleta) {
    }

    public String setBoleta(String boleta) {
    }

    public String getBoleta(String boleta) {
    }

    public String setBoleta(String boleta) {
    }

    public String getBoleta(String boleta) {
    }

    public String setBoleta(String boleta) {
    }
}

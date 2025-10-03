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

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
}

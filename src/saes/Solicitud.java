package saes;

public class Solicitud {
    TipoSolicitud tipo;
    String fecha;
    String descripcion;

    public Solicitud(TipoSolicitud tipo, String fecha, String descripcion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public void setTipo(TipoSolicitud tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package saes;

public class Materia {
    private String nombre;
    private String carrera;
    private float creditos;
    private float horasteoria;
    private float horaspractica;

    public Materia() {
        nombre = "";
        carrera = "";
        creditos = 7.5f;
        horaspractica = 1.5f;
        horasteoria = 3.0f;
    }

    public Materia(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
        creditos = 7.5f;
        horaspractica = 1.5f;
        horasteoria = 3.0f;
    }

    public Materia(String nombre, String carrera, float creditos, float horasteoria, float horaspractica) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.creditos = creditos;
        this.horasteoria = horasteoria;
        this.horaspractica = horaspractica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera() {
        this.carrera = carrera;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos() {
        this.creditos = creditos;
    }

    public float getHorasPractica() {
        return horaspractica;
    }

    public void setHorasPractica() {
        this.horaspractica = horaspractica;
    }

    public float getHorasTeoria() {
        return horasteoria;
    }

    public void setHorasTeoria() {
        this.horasteoria = horasteoria;
    }

}

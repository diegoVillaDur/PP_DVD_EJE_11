package saes;

public class Maestro {
    String nombre;
    String numeroempleado;
    String academia;
    Materia materias;

    public Maestro() {
        nombre = "";
        numeroempleado = "";
        academia = "";
        materias = new Materia();
    }

    public Maestro(String nombre, String numeroempleado, String academia, Materia materias) {
        this.nombre = nombre;
        this.numeroempleado = numeroempleado;
        this.academia = academia;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroEmpleado() {
        return numeroempleado;
    }

    public void setNumeroEmpleado(String numeroempleado) {
        this.numeroempleado = numeroempleado;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }
}

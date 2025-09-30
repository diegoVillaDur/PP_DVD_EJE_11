package saes;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private int semestre;
    private String nombre;
    private String carrera;
    private int cupo;
    private List<Alumno> alumnos;
    private List<Materia> materias;

    public Grupo() {
        semestre = 0;
        cupo = 40;
        carrera = "";
        alumnos = new ArrayList<Alumno>();
        materias = new ArrayList<Materia>();
    }

    public Grupo(String nombre, int semestre, String carrera) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
        alumnos = new ArrayList<Alumno>();
        materias = new ArrayList<Materia>();
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materia) {
        materias.add(materia);
    }
    
    public boolean inscribirAlumno(Alumno alumno) {
        if (alumnos.size() < cupo) {
            alumnos.add(alumno);
            return true;
        } else {
            return false;
        }
    }
}

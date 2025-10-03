import saes.Alumno;
import saes.Grupo;
import saes.Materia;

public class App {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Juan Pérez", "23A546", true);
        Alumno alumno2 = new Alumno("María López", "22B123");
        Alumno alumno3 = new Alumno("Carlos Sánchez", "21C789", false);

        Grupo grupo1 = new Grupo("A", 3, "Ingeniería en Sistemas");
        Grupo grupo2 = new Grupo("B", 2, "Administración de Empresas");
        Grupo grupo3 = new Grupo("C", 1, "Derecho");

        Materia materia1 = new Materia("Matemáticas Discretas", "Ingeniería en Sistemas", 8.0f, 3.0f, 2.0f);
        Materia materia2 = new Materia("Contabilidad", "Administración de Empresas", 7.0f, 2.0f, 3.0f);
        Materia materia3 = new Materia("Introducción al Derecho", "Derecho", 6.0f, 4.0f, 1.0f);

        grupo1.inscribirAlumno(alumno1);
        grupo2.inscribirAlumno(alumno2);
        grupo3.inscribirAlumno(alumno3);

        grupo1.setMaterias(materia1);
        grupo2.setMaterias(materia2);
        grupo3.setMaterias(materia3);

        System.out.println("Alumnos inscritos en el grupo " + grupo1.getNombre() + ":");
        for (Alumno alumno : grupo1.getAlumnos()) {
            System.out.println("- " + alumno.getNombre() + " (Boleta: " + alumno.getBoleta() + ")");
        }

        System.out.println("\nAlumnos inscritos en el grupo " + grupo2.getNombre() + ":");
        for (Alumno alumno : grupo2.getAlumnos()) {
            System.out.println("- " + alumno.getNombre() + " (Boleta: " + alumno.getBoleta() + ")");
        }

        System.out.println("\nAlumnos inscritos en el grupo " + grupo3.getNombre() + ":");
        for (Alumno alumno : grupo3.getAlumnos()) {
            System.out.println("- " + alumno.getNombre() + " (Boleta: " + alumno.getBoleta() + ")");
        }

        System.out.println("Hello, World!");
    }
}

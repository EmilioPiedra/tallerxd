package ec.edu.utpl.semana6.pe.report;

import ec.edu.utpl.semana6.pe.model.Actividad;
import ec.edu.utpl.semana6.pe.model.Estudiante;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Reporte {
    public static void main(String[] args) {
        System.out.println("Promedio");


    }

    public static double promedioActividad(String nombreActividad, List<Estudiante> estudiantes) {
        Estudiante seleccionado = null;
        if ( Objects.nonNull(seleccionado)){
            for (var estudiante: estudiantes){
                if (estudiante.getNombre().equalsIgnoreCase(nombreActividad)){
                    seleccionado = estudiante;
                }
            }
            double suma = 0;
            for (var actividad : seleccionado.getActividades()){
                suma += actividad.getNota();
            }
            double promedioAct = suma / seleccionado.getActividades().size();
        }

        return 0;
    }

    public static double notaMayorActividad(String nombreActividad, List<Estudiante> estudiantes) {
        return 0;
    }

    public static double notamenorActividad(String nombreActividad, List<Estudiante> estudiantes) {
        return 0;
    }

    public static double notaFinalEstudiante(String apellido, String nombre, List<Estudiante> estudiantes) {
        Estudiante seelcionado = null;
        if (Objects.nonNull(seelcionado)){
        for (var estudiante : estudiantes){
            if (estudiante.getApellido().equalsIgnoreCase(apellido) && estudiante.getNombre().equalsIgnoreCase(nombre)){
                seelcionado = estudiante;
            }
        }
        double suma=0;
        for (var activdad : seelcionado.getActividades()){
            suma +=activdad.getNota();
        }
        double promedio = suma / seelcionado.getActividades().size();
        return promedio;

        }else {
            throw new NoSuchElementException("No se encuentra nombre");
        }
    }


    public static List<Estudiante> getEstudiantes() {
        List<Estudiante> estudiantes;
        Estudiante est1 = new Estudiante("Fernando", "Alonso");
        Estudiante est2 = new Estudiante("Sebastián", "Yatra");
        Estudiante est3 = new Estudiante("Javiera", "Atenas");
        Estudiante est4 = new Estudiante("Mario", "Sábato");
        Estudiante est5 = new Estudiante("Rodrigo", "Noboa");
        Estudiante est6 = new Estudiante("Priscilla", "González");
        Estudiante est7 = new Estudiante("Esther", "Anaya");

        est1.addActividad("Cuestionario 1", 10);
        est1.addActividad("Cuestionario 2", 7.7);
        est1.addActividad("Taller 1", 5);
        est1.addActividad("Taller 2", 8);

        est2.addActividad("Cuestionario 1", 9);
        est2.addActividad("Cuestionario 2", 8.4);
        est2.addActividad("Taller 1", 10);
        est2.addActividad("Taller 2", 9.5);

        est3.addActividad("Cuestionario 1", 6);
        est3.addActividad("Cuestionario 2", 10);
        est3.addActividad("Taller 1", 9);
        est3.addActividad("Taller 2", 9);

        est4.addActividad("Cuestionario 1", 4);
        est4.addActividad("Cuestionario 2", 6.8);
        est4.addActividad("Taller 1", 8.9);
        est4.addActividad("Taller 2", 9);

        est5.addActividad("Cuestionario 1", 9.3);
        est5.addActividad("Cuestionario 2", 8.1);
        est5.addActividad("Taller 1", 10);
        est5.addActividad("Taller 2", 3);

        est6.addActividad("Cuestionario 1", 6);
        est6.addActividad("Cuestionario 2", 10);
        est6.addActividad("Taller 1", 9);
        est6.addActividad("Taller 2", 9);

        est7.addActividad("Cuestionario 1", 5.9);
        est7.addActividad("Cuestionario 2", 7);
        est7.addActividad("Taller 1", 8);
        est7.addActividad("Taller 2", 7.5);

        return List.of(est1, est2, est3, est4, est5, est6, est7);

    }
}

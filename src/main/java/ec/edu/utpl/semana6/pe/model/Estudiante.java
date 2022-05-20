package ec.edu.utpl.semana6.pe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private String apellido;
    private List<Actividad> actividades;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        actividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void addActividad(String nombre, double nota) {
        if(Objects.nonNull(nombre) && !nombre.isBlank() && !nombre.isEmpty()) {
            if( nota >= 0) {
                actividades.add(new Actividad(nombre, nota));
            } else {
                throw new IllegalArgumentException("La nota debe ser igual o mayor a 0");
            }
        } else {
            throw new IllegalArgumentException("Revise el nombre de la actividad, no es correcta");
        }
    }

    public List<Actividad> getActividades() {
        return actividades;
    }
}

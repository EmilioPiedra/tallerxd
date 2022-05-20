import static org.junit.jupiter.api.Assertions.assertEquals;

import ec.edu.utpl.semana6.pe.report.Reporte;
import org.junit.jupiter.api.Test;

public class ReporteTest {

    @Test
    void avgCuestionario1() {
        assertEquals(7.171429,
                Reporte.promedioActividad("Cuestionario 1", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void avgCuestionario2() {
        assertEquals(8.285714285714286,
                Reporte.promedioActividad("Cuestionario 2", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void avgTaller1() {
        assertEquals(8.557142857142857,
                Reporte.promedioActividad("Taller 1", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void avgTaller2() {
        assertEquals(8.557142857142857,
                Reporte.promedioActividad("Taller 1", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void mayorCuestionario1() {
        assertEquals(10.0,
                Reporte.notaMayorActividad("Cuestionario 1", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void mayorCuestionario2() {
        assertEquals(10.0,
                Reporte.notaMayorActividad("Cuestionario 2", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void mayorTaller1() {
        assertEquals(10.0,
                Reporte.notaMayorActividad("Cuestionario 2", Reporte.getEstudiantes()),
                0.001);
    }

    @Test
    void mayorTaller2() {
        assertEquals(9.5,
                Reporte.notaMayorActividad("Cuestionario 2", Reporte.getEstudiantes()),
                0.001);
    }
}

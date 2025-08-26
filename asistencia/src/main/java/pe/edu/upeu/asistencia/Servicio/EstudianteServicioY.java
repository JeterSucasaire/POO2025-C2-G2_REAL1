package pe.edu.upeu.asistencia.Servicio;

import pe.edu.upeu.asistencia.Modelo.Estudiante;
import java.util.List;


public interface EstudianteServicioY {
    void saveEntidad(Estudiante estudiante);
    List<Estudiante> fingAllEntidades();
    void updateEntidad(Estudiante estudiante, int index);
    void deleteEntidad(int idex);
    Estudiante findEntidad(int index);
}

package pe.edu.upeu.asistencia.Servicio;

import pe.edu.upeu.asistencia.Modelo.Estudiante;
import pe.edu.upeu.asistencia.Repositorio.EstudianteRepositorio;

import java.util.List;

public class EstudianteServicioIMP extends EstudianteRepositorio implements EstudianteServicioY{
    @Override
    public void saveEntidad(Estudiante estudiante) {
        ListaEstudiantes.add(estudiante);
    }

    @Override
    public List<Estudiante> fingAllEntidades() {
        return ListaEstudiantes;
    }

    @Override
    public void updateEntidad(Estudiante estudiante, int index) {
        ListaEstudiantes.set(index,estudiante);
    }

    @Override
    public void deleteEntidad(int idex) {
        ListaEstudiantes.remove(idex);
    }

    @Override
    public Estudiante findEntidad(int index) {
        return ListaEstudiantes.get(index);
    }
}

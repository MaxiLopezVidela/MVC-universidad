package Modelo;

import Persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPer = new ControladoraPersistencia();


    public void crearEstudiante(Estudiante est) {
        controlPer.createEstudiante(est);
    }

    public Estudiante buscarEstudiante(int id) {
        return controlPer.traerEstudiante(id);
    }

    public void editarEstudiante(Estudiante est) {
        controlPer.editarEstudiante(est);
    }

    public void eliminarEstudiante(int id) {
        controlPer.eliminarEstudiante(id);
    }

    public boolean existeEstudiante(int id) {
        return controlPer.traerEstudiante(id) != null;
    }


    public ProyectoDeGrado buscarProyecto(int id) {
        return controlPer.traerProyecto(id);
    }

    public void editarProyecto(ProyectoDeGrado proy) {
        controlPer.editarProyecto(proy);
    }

    public void eliminarProyecto(int id) {
        controlPer.eliminarProyecto(id);
    }

    public boolean existeProyecto(int id) {
        return controlPer.traerProyecto(id) != null;
    }
}
package Persistencia;

import Modelo.Estudiante;
import Modelo.ProyectoDeGrado;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private EstudianteJpaController estudianteJpa = new EstudianteJpaController();
    private ProyectoDeGradoJpaController proyectoJpa = new ProyectoDeGradoJpaController();

    public void createEstudiante(Estudiante est) {
        try {
            estudianteJpa.create(est);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEstudiante(int id) {
        try {
            estudianteJpa.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarProyecto(int id) {
        try {
            proyectoJpa.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEstudiante(Estudiante est) {
        try {
            estudianteJpa.edit(est);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarProyecto(ProyectoDeGrado proy) {
        try {
            proyectoJpa.edit(proy);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Estudiante traerEstudiante(int id) {
        return estudianteJpa.findEstudiante(id);
    }

    public ProyectoDeGrado traerProyecto(int id) {
        return proyectoJpa.findProyectoDeGrado(id);
    }
}

package Modelo;

import java.util.ArrayList;

public class EjecucionDelProyecto {
    private String proyectoDeGradoTerminado;
    private int recursosDisponibles;
     private ArrayList<Estudiante>estudiantes = new ArrayList();
    private ArrayList<PersonalDocente>personalDocentes = new ArrayList();
    private Resultado resultado = new Resultado();

    public EjecucionDelProyecto() {
    }

    public EjecucionDelProyecto(String proyectoDeGradoTerminado, int recursosDisponibles) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getProyectoDeGradoTerminado() {
        return proyectoDeGradoTerminado;
    }

    public void setProyectoDeGradoTerminado(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiantes(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    public ArrayList<PersonalDocente> getPersonalDocentes() {
        return personalDocentes;
    }

    public void addPersonalDocentes(PersonalDocente personalDocentes) {
        this.personalDocentes.add(personalDocentes);
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    
    
}

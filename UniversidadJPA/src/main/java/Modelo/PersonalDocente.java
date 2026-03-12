package Modelo;

import java.util.ArrayList;

public class PersonalDocente {
    private String conocimiento;
    private String experiencia;
    private int trayectoria;
    private ArrayList<Universidad>universidades = new ArrayList();
    private Estudiante estudiante;
    private EjecucionDelProyecto ejecucionDelProyecto;
    private Recopilacion recopilacion;

    public PersonalDocente() {
    }

    public PersonalDocente(String conocimiento, String experiencia, int trayectoria, Estudiante estudiante, EjecucionDelProyecto ejecucionDelProyecto, Recopilacion recopilacion) {
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
        this.estudiante = estudiante;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
        this.recopilacion = recopilacion;
    }
     public PersonalDocente(String conocimiento, String experiencia, int trayectoria) {
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }

    public void addUniversidades(Universidad universidades) {
        this.universidades.add(universidades);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public Recopilacion getRecopilacion() {
        return recopilacion;
    }

    public void setRecopilacion(Recopilacion recopilacion) {
        this.recopilacion = recopilacion;
    }
    
    
    
   
    
}

package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProyectoDeGrado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic private String alcance;
    @Basic private int costo;
    @Basic private String objetivo;
    @Basic private String planDeProyecto;
    @Basic private int tiempoDeRealizacion;
    @Basic private String titulo;
    @Basic private int viabilidad;

    @OneToOne(mappedBy = "proyectoDeGrado")
    private Estudiante estudiante;

    public ProyectoDeGrado() {}

    public ProyectoDeGrado(String alcance, int costo, String objetivo, String planDeProyecto,
                           int tiempoDeRealizacion, String titulo, int viabilidad) {

        this.alcance = alcance;
        this.costo = costo;
        this.objetivo = objetivo;
        this.planDeProyecto = planDeProyecto;
        this.tiempoDeRealizacion = tiempoDeRealizacion;
        this.titulo = titulo;
        this.viabilidad = viabilidad;
    }

    public int getId() { 
        return id;
    }

    public String getAlcance() { 
        return alcance; 
    }
    public void setAlcance(String alcance) { 
        this.alcance = alcance; 
    }

    public int getCosto() {
        return costo; 
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getObjetivo() {
        return objetivo; 
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo; 
    }

    public String getPlanDeProyecto() {
        return planDeProyecto; 
    }
    public void setPlanDeProyecto(String planDeProyecto) { 
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() { 
        return tiempoDeRealizacion; 
    }
    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion; 
    }

    public String getTitulo() { 
        return titulo; 
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public int getViabilidad() {
        return viabilidad;
    }
    public void setViabilidad(int viabilidad) { 
        this.viabilidad = viabilidad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        if (estudiante != null && estudiante.getProyectoDeGrado() != this) {
            estudiante.setProyectoDeGrado(this);
        }
    }
}

package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

@Entity
public class Estudiante implements Serializable {

    @Id
    private int aspiranteAGrado;

    @Transient
    private ArrayList<Universidad> universidades = new ArrayList<>();

    @Transient
    private ArrayList<PersonalDocente> personalDocentes = new ArrayList<>();

    @Transient
    private EjecucionDelProyecto ejecucionDelProyecto;

    @Transient
    private ArrayList<Soluciones> soluciones = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "proyecto_id")
    private ProyectoDeGrado proyectoDeGrado;

    public Estudiante() {}

    public Estudiante(int aspiranteAGrado, ProyectoDeGrado proyectoDeGrado,
                      EjecucionDelProyecto ejecucionDelProyecto) {

        this.aspiranteAGrado = aspiranteAGrado;
        this.proyectoDeGrado = proyectoDeGrado;
        this.ejecucionDelProyecto = ejecucionDelProyecto;

        if (proyectoDeGrado != null) {
            proyectoDeGrado.setEstudiante(this);
        }
    }

    public int getAspiranteAGrado() { 
        return aspiranteAGrado; 
    }
    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado; 
    }

    public ProyectoDeGrado getProyectoDeGrado() { return proyectoDeGrado; }

    public void setProyectoDeGrado(ProyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
        if (proyectoDeGrado != null)
            proyectoDeGrado.setEstudiante(this);
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() { return ejecucionDelProyecto; }
    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) { 
        this.ejecucionDelProyecto = ejecucionDelProyecto; 
    }

    public ArrayList<Universidad> getUniversidades() { 
        return universidades;
    }
    public void addUniversidades(Universidad uni) { 
        this.universidades.add(uni); 
    }

    public ArrayList<PersonalDocente> getPersonalDocentes() { 
        return personalDocentes;
    }
    public void addPersonalDocentes(PersonalDocente pd) { 
        this.personalDocentes.add(pd);
    }

    public ArrayList<Soluciones> getSoluciones() { 
        return soluciones;
    }
    public void addSoluciones(Soluciones sol) {
        this.soluciones.add(sol); 
    }
}

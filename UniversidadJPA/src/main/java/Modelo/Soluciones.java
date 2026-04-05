package Modelo;

import java.util.ArrayList;

public class Soluciones {
    private String alternativas;
    private ArrayList<Estudiante>estudiantes = new ArrayList();

    public Soluciones() {
    }

    public Soluciones(String alternativas) {
        this.alternativas = alternativas;
    }

    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiantes(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }
    
    
    
}

package Modelo;

import java.util.ArrayList;

public class InterfazIngresoInformacion {
    private String comentariosAbiertosEnLinea;
    private String formularioEnLinea;
    private int plataformaDeSoftware;
    private ArrayList<Problema> problemas = new ArrayList ();
    private ArrayList<Necesidad> necesidades = new ArrayList ();

    public InterfazIngresoInformacion() {
    }

    public InterfazIngresoInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, int plataformaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formularioEnLinea = formularioEnLinea;
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }

    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormularioEnLinea() {
        return formularioEnLinea;
    }

    public void setFormularioEnLinea(String formularioEnLinea) {
        this.formularioEnLinea = formularioEnLinea;
    }

    public int getPlataformaDeSoftware() {
        return plataformaDeSoftware;
    }

    public void setPlataformaDeSoftware(int plataformaDeSoftware) {
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public void addProblemas(Problema problemas) {
        this.problemas.add(problemas);
    }

    public ArrayList<Necesidad> getNecesidades() {
        return necesidades;
    }

    public void addNecesidades(Necesidad necesidades) {
        this.necesidades.add(necesidades);
    }
    
    
    
    
}

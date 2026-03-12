package Modelo;

import java.util.ArrayList;

public class Region {
    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList<Universidad>universidades = new ArrayList();
    private ArrayList<Necesidad>necesidades = new ArrayList();
    private ArrayList<Problema>problemas = new ArrayList();

    public Region() {
    }

    public Region(String aspectosSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public String getAspectosSocioCulturales() {
        return aspectosSocioCulturales;
    }

    public void setAspectosSocioCulturales(String aspectosSocioCulturales) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }

    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }

    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }

    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }

    public void addUniversidades(Universidad universidades) {
        this.universidades.add(universidades);
    }

    public ArrayList<Necesidad> getNecesidades() {
        return necesidades;
    }

    public void addNecesidades(Necesidad necesidades) {
        this.necesidades.add(necesidades);
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public void addProblemas(Problema problemas) {
        this.problemas.add(problemas);
    }
    
    
    
    
    
    
}

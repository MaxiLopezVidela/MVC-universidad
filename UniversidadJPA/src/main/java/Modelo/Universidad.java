package Modelo;

import java.util.ArrayList;


public class Universidad {
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    private ArrayList<Estudiante>estudiantes = new ArrayList();
    private ArrayList<Region>regiones = new ArrayList();
    private ArrayList<RecoleccionDeInformacion>recoleccionDeInformaciones = new ArrayList();
    private ArrayList<PersonalDocente>personalDocentes = new ArrayList();

    public Universidad() {
    }

    public Universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
    }

    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }

    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }

    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiantes(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    public ArrayList<Region> getRegiones() {
        return regiones;
    }

    public void addRegiones(Region regiones) {
        this.regiones.add(regiones);
    }

    public ArrayList<RecoleccionDeInformacion> getRecoleccionDeInformaciones() {
        return recoleccionDeInformaciones;
    }

    public void addRecoleccionDeInformaciones(RecoleccionDeInformacion recoleccionDeInformaciones) {
        this.recoleccionDeInformaciones.add(recoleccionDeInformaciones);
    }

    public ArrayList<PersonalDocente> getPersonalDocentes() {
        return personalDocentes;
    }

    public void addPersonalDocentes(PersonalDocente personalDocentes) {
        this.personalDocentes.add(personalDocentes);
    }
    
    
    
}

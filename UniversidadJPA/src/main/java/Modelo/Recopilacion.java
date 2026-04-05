package Modelo;

public class Recopilacion extends RecoleccionDeInformacion {
    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;

    public Recopilacion() {
    }

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosdirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, int plataformaDeSoftware) {
        super(datosDeLosAfectados, datosDeLosdirectamenteInteresados, comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public String getDatosMayorFavorabilidad() {
        return datosMayorFavorabilidad;
    }

    public void setDatosMayorFavorabilidad(String datosMayorFavorabilidad) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
    }

    public String getDatosMayorUrgencia() {
        return datosMayorUrgencia;
    }

    public void setDatosMayorUrgencia(String datosMayorUrgencia) {
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

  
    
    
    
    
}

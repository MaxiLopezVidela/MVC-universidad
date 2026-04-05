package Modelo;

public class RecoleccionDeInformacion extends InterfazIngresoInformacion {
    private String datosDeLosAfectados;
    private String datosDeLosdirectamenteInteresados;

    public RecoleccionDeInformacion() {
    }
    
    

    public RecoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosdirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, int plataformaDeSoftware) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosdirectamenteInteresados = datosDeLosdirectamenteInteresados;
    }

    public String getDatosDeLosAfectados() {
        return datosDeLosAfectados;
    }

    public void setDatosDeLosAfectados(String datosDeLosAfectados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
    }

    public String getDatosDeLosdirectamenteInteresados() {
        return datosDeLosdirectamenteInteresados;
    }

    public void setDatosDeLosdirectamenteInteresados(String datosDeLosdirectamenteInteresados) {
        this.datosDeLosdirectamenteInteresados = datosDeLosdirectamenteInteresados;
    }
    
    
    
    
}

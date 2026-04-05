package ProyectoJPA;

import Controlador.ControladorVista;
import Vista.Vista;

public class UniversidadJPA {

    public static void main(String[] args) {
        Vista miVista = new Vista();
        new ControladorVista(miVista);
        miVista.setVisible(true);
        miVista.setLocationRelativeTo(null);
    }
}
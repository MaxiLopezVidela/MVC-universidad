package ProyectoJPA;

import Controlador.Controladora;
import Vista.Vista;

public class UniversidadJPA {

    public static void main(String[] args) {
        
        Vista miVista = new Vista();
        
     
        Controladora control = new Controladora(miVista);

        miVista.setVisible(true);
        miVista.setLocationRelativeTo(null);
    }
}

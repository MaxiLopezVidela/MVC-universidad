package Controlador;

import Modelo.Estudiante;
import Modelo.ProyectoDeGrado;
import Persistencia.ControladoraPersistencia;
import Vista.Vista;

import javax.swing.JOptionPane;

public class Controladora {

    private Vista vista;
    private ControladoraPersistencia controlPersis;

    public Controladora(Vista vista) {
        this.vista = vista;
        this.controlPersis = new ControladoraPersistencia();
        agregarEventos();
    }

    private void agregarEventos() {
        vista.cargar.addActionListener(e -> cargarEstudiante());
        vista.jBBuscar.addActionListener(e -> buscar());
        vista.jBBorrar.addActionListener(e -> borrar());
        vista.jBEditar.addActionListener(e -> editar());
    }

    private void cargarEstudiante() {
        try {
            int id = Integer.parseInt(vista.id_estudiante.getText());

            ProyectoDeGrado proy = new ProyectoDeGrado(
                vista.alcance.getText(),
                Integer.parseInt(vista.costo.getText()),
                vista.objetivo.getText(),
                vista.plan.getText(),
                Integer.parseInt(vista.tiempo.getText()),
                vista.titulo.getText(),
                Integer.parseInt(vista.viabilidad.getText())
            );

            Estudiante est = new Estudiante(id, proy, null);
            proy.setEstudiante(est);

            controlPersis.createEstudiante(est);

            JOptionPane.showMessageDialog(vista, "Estudiante y proyecto guardados.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
        }
    }

private void buscar() {

    String input = JOptionPane.showInputDialog(vista, "Ingrese ID estudiante o proyecto:");
    if (input == null || input.isEmpty())
        return;

    int id = Integer.parseInt(input);

    
    Estudiante est = controlPersis.traerEstudiante(id);

    if (est != null) {
        ProyectoDeGrado p = est.getProyectoDeGrado();

        JOptionPane.showMessageDialog(vista,
                "ESTUDIANTE\n" +
                "ID: " + est.getAspiranteAGrado() +
                "\n\nPROYECTO\n" +
                "ID: " + p.getId() +
                "\nTítulo: " + p.getTitulo() +
                "\nObjetivo: " + p.getObjetivo() +
                "\nAlcance: " + p.getAlcance() +
                "\nPlan: " + p.getPlanDeProyecto() +
                "\nCosto: " + p.getCosto() +
                "\nTiempo: " + p.getTiempoDeRealizacion() +
                "\nViabilidad: " + p.getViabilidad()
        );
        return;
    }

    
    ProyectoDeGrado p = controlPersis.traerProyecto(id);

    if (p != null) {
        JOptionPane.showMessageDialog(vista,
                "PROYECTO\n" +
                "ID: " + p.getId() +
                "\nTítulo: " + p.getTitulo() +
                "\nObjetivo: " + p.getObjetivo() +
                "\nAlcance: " + p.getAlcance() +
                "\nPlan: " + p.getPlanDeProyecto() +
                "\nCosto: " + p.getCosto() +
                "\nTiempo: " + p.getTiempoDeRealizacion() +
                "\nViabilidad: " + p.getViabilidad()
        );
        return;
    }

    JOptionPane.showMessageDialog(vista, "No existe.");
}


    private void borrar() {
        String input = JOptionPane.showInputDialog(vista, "ID a borrar:");
        if (input == null || input.isEmpty())
            return;

        int id = Integer.parseInt(input);

        Estudiante est = controlPersis.traerEstudiante(id);

        if (est != null) {
            controlPersis.eliminarEstudiante(id);
            JOptionPane.showMessageDialog(vista, "Estudiante eliminado.");
            return;
        }

        ProyectoDeGrado p = controlPersis.traerProyecto(id);

        if (p != null) {
            controlPersis.eliminarProyecto(id);
            JOptionPane.showMessageDialog(vista, "Proyecto eliminado.");
            return;
        }

        JOptionPane.showMessageDialog(vista, "No existe.");
    }

private void editar() {

    String input = JOptionPane.showInputDialog(vista, "ID estudiante:");
    if (input == null || input.isEmpty())
        return;

    int id;
    try {
        id = Integer.parseInt(input);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vista, "ID inválido.");
        return;
    }

    Estudiante est = controlPersis.traerEstudiante(id);
    if (est == null) {
        JOptionPane.showMessageDialog(vista, "No encontrado.");
        return;
    }

    ProyectoDeGrado p = est.getProyectoDeGrado();
    if (p == null) {
        JOptionPane.showMessageDialog(vista, "El estudiante no tiene proyecto asociado.");
        return;
    }

    try {
        String nuevoTitulo = JOptionPane.showInputDialog(vista, "Título:", p.getTitulo());
        if (nuevoTitulo != null) p.setTitulo(nuevoTitulo);

        String nuevoObjetivo = JOptionPane.showInputDialog(vista, "Objetivo:", p.getObjetivo());
        if (nuevoObjetivo != null) p.setObjetivo(nuevoObjetivo);

        String nuevoAlcance = JOptionPane.showInputDialog(vista, "Alcance:", p.getAlcance());
        if (nuevoAlcance != null) p.setAlcance(nuevoAlcance);

        String nuevoPlan = JOptionPane.showInputDialog(vista, "Plan:", p.getPlanDeProyecto());
        if (nuevoPlan != null) p.setPlanDeProyecto(nuevoPlan);

        String costoStr = JOptionPane.showInputDialog(vista, "Costo:", String.valueOf(p.getCosto()));
        if (costoStr != null && !costoStr.isEmpty()) {
            p.setCosto(Integer.parseInt(costoStr));
        }

        String tiempoStr = JOptionPane.showInputDialog(vista, "Tiempo:", String.valueOf(p.getTiempoDeRealizacion()));
        if (tiempoStr != null && !tiempoStr.isEmpty()) {
            p.setTiempoDeRealizacion(Integer.parseInt(tiempoStr));
        }

        String viaStr = JOptionPane.showInputDialog(vista, "Viabilidad:", String.valueOf(p.getViabilidad()));
        if (viaStr != null && !viaStr.isEmpty()) {
            p.setViabilidad(Integer.parseInt(viaStr));
        }

        
        controlPersis.editarProyecto(p);

        
        ProyectoDeGrado pActualizado = controlPersis.traerProyecto(p.getId());
        if (pActualizado != null) {
            
            vista.titulo.setText(pActualizado.getTitulo());
            vista.alcance.setText(pActualizado.getAlcance());
            vista.objetivo.setText(pActualizado.getObjetivo());
            vista.plan.setText(pActualizado.getPlanDeProyecto());
            vista.costo.setText(String.valueOf(pActualizado.getCosto()));
            vista.tiempo.setText(String.valueOf(pActualizado.getTiempoDeRealizacion()));
            vista.viabilidad.setText(String.valueOf(pActualizado.getViabilidad()));
        }

        JOptionPane.showMessageDialog(vista, "Cambios guardados.");

    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(vista, "Alguno de los campos numéricos no es válido.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(vista, "Error al guardar cambios: " + ex.getMessage());
    }
}

}

package Modelo;

public class ProyectoUniversidad {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        
        e1.getUniversidades().add(new Universidad("UNCUYO","Ingenieria,Arquitectura","Privada = no","Publica = si"));
        e1.getUniversidades().get(0).getRecoleccionDeInformaciones().add(new RecoleccionDeInformacion("Gente del pueblo","Licitadores y estudiantes","Negativos","Completo",1));
        e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getNecesidades().add(new Necesidad("Ropa limpia"));
        
        e1.setProyectoDeGrado(new ProyectoDeGrado("Corto",10000,"Tesis","Armado de puentes en regiones de baja disponibilidad",30,"PuenteVida",70));
        
        e1.setEjecucionDelProyecto(new EjecucionDelProyecto("En proceso",6000));
        
        
        e1.addPersonalDocentes(new PersonalDocente("Elevado","Mucha",25));
        e1.addPersonalDocentes(new PersonalDocente("Medio","Moderada",4));
        
        
        System.out.println("Universidad a la que pertenece el estudiante: "+ e1.getUniversidades().get(0).getCunaDelConocimiento()+"\nCarreras: "+e1.getUniversidades().get(0).getDiferentesCarreras()+
                "\nEs privada? "+ e1.getUniversidades().get(0).getPrivada()+"\nEs publica? "+e1.getUniversidades().get(0).getPublica());
        
        System.out.println("Necesidades insatisfechas del estudiante: " + e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getNecesidades().get(0).getDefinir());
        
        System.out.println("Proyecto de grado que realiza el estudiante: \nObjetivo: "+ e1.getProyectoDeGrado().getObjetivo()+"\nAlcance: "+
                e1.getProyectoDeGrado().getAlcance()+"\nCosto en dolares: "+e1.getProyectoDeGrado().getCosto()+"\nPlan: "+e1.getProyectoDeGrado().getPlanDeProyecto()+ "\nTiempo de realizacion en semanas: "+e1.getProyectoDeGrado().getTiempoDeRealizacion()+"\nTitulo: "+e1.getProyectoDeGrado().getTitulo()+
                "\nPorcentaje de viabilidad: "+e1.getProyectoDeGrado().getViabilidad());
        System.out.println("Estado del proyecto: "+e1.getEjecucionDelProyecto().getProyectoDeGradoTerminado()+"\nRecursos en dolares disponibles: "+e1.getEjecucionDelProyecto().getRecursosDisponibles());
        
        System.out.println("Datos de afectados: "+e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getDatosDeLosAfectados()+"\nDatos de los interesados: "+
                e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getDatosDeLosdirectamenteInteresados()+"\nComentarios en Linea: "+ e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getComentariosAbiertosEnLinea()+
                "\nFormulario en linea: "+e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getFormularioEnLinea()+"\nPlataforma de software: "+e1.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getPlataformaDeSoftware());
        
        System.out.println("Docentes que tiene el estudiante: \nPrimer Docente: \nNivel de conocimiento: " +e1.getPersonalDocentes().get(0).getConocimiento()+"\nExperiencia: "+ e1.getPersonalDocentes().get(0).getExperiencia()+"\nTrayectoria en anios: "+e1.getPersonalDocentes().get(0).getTrayectoria());
        System.out.println("Segundo Docente: \nNivel de conocimiento: " +e1.getPersonalDocentes().get(1).getConocimiento()+"\nExperiencia: "+ e1.getPersonalDocentes().get(1).getExperiencia()+"\nTrayectoria en anios: "+e1.getPersonalDocentes().get(1).getTrayectoria());
    }
}

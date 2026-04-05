package Modelo;

import Modelo.Estudiante;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-03-20T19:33:34", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ProyectoDeGrado.class)
public class ProyectoDeGrado_ { 

    public static volatile SingularAttribute<ProyectoDeGrado, String> objetivo;
    public static volatile SingularAttribute<ProyectoDeGrado, Estudiante> estudiante;
    public static volatile SingularAttribute<ProyectoDeGrado, String> planDeProyecto;
    public static volatile SingularAttribute<ProyectoDeGrado, Integer> costo;
    public static volatile SingularAttribute<ProyectoDeGrado, Integer> viabilidad;
    public static volatile SingularAttribute<ProyectoDeGrado, String> titulo;
    public static volatile SingularAttribute<ProyectoDeGrado, Integer> id;
    public static volatile SingularAttribute<ProyectoDeGrado, Integer> tiempoDeRealizacion;
    public static volatile SingularAttribute<ProyectoDeGrado, String> alcance;

}
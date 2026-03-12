package Persistencia;

import Modelo.ProyectoDeGrado;
import Persistencia.exceptions.NonexistentEntityException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProyectoDeGradoJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniversidadJPAPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ProyectoDeGrado proyecto) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(proyecto);
        em.getTransaction().commit();
        em.close();
    }

public void edit(ProyectoDeGrado proyecto) throws Exception {

    EntityManager em = getEntityManager();

    try {
        em.getTransaction().begin();

        ProyectoDeGrado existente = em.find(ProyectoDeGrado.class, proyecto.getId());
        if (existente == null) {
            throw new NonexistentEntityException("No existe proyecto con id " + proyecto.getId());
        }

        
        if (proyecto.getEstudiante() != null) {
            proyecto.getEstudiante().setProyectoDeGrado(proyecto);
            em.merge(proyecto.getEstudiante());
        }

       
        em.merge(proyecto);

        em.getTransaction().commit();

    } finally {
        if (em.isOpen()) em.close();
    }
}



    public ProyectoDeGrado findProyectoDeGrado(int id) {
        EntityManager em = getEntityManager();
        ProyectoDeGrado p = em.find(ProyectoDeGrado.class, id);
        em.close();
        return p;
    }

    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        ProyectoDeGrado p = em.find(ProyectoDeGrado.class, id);
        if (p == null)
            throw new NonexistentEntityException("No existe proyecto con id " + id);

        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }
}

package Persistencia;

import Modelo.Estudiante;
import Persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstudianteJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniversidadJPAPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudiante estudiante) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }

    public void edit(Estudiante est) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            Estudiante estBD = em.find(Estudiante.class, est.getAspiranteAGrado());
            if (estBD == null)
                throw new NonexistentEntityException(
                    "No existe estudiante con id " + est.getAspiranteAGrado());

            estBD.setProyectoDeGrado(est.getProyectoDeGrado());
            estBD.setEjecucionDelProyecto(est.getEjecucionDelProyecto());

            em.merge(estBD);
            em.getTransaction().commit();

        } catch (Exception ex) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }

    public Estudiante findEstudiante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            Estudiante est = em.find(Estudiante.class, id);
            if (est == null)
                throw new NonexistentEntityException(
                    "No existe estudiante con id " + id);

            em.remove(est);
            em.getTransaction().commit();

        } catch (Exception ex) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }
}
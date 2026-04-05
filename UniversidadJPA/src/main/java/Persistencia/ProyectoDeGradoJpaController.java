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
        try {
            em.getTransaction().begin();
            em.persist(proyecto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }

    public void edit(ProyectoDeGrado proyecto) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            ProyectoDeGrado existente = em.find(ProyectoDeGrado.class, proyecto.getId());
            if (existente == null)
                throw new NonexistentEntityException(
                    "No existe proyecto con id " + proyecto.getId());

            existente.setTitulo(proyecto.getTitulo());
            existente.setObjetivo(proyecto.getObjetivo());
            existente.setAlcance(proyecto.getAlcance());
            existente.setPlanDeProyecto(proyecto.getPlanDeProyecto());
            existente.setCosto(proyecto.getCosto());
            existente.setTiempoDeRealizacion(proyecto.getTiempoDeRealizacion());
            existente.setViabilidad(proyecto.getViabilidad());

            em.merge(existente);
            em.getTransaction().commit();

        } catch (Exception ex) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }

    public ProyectoDeGrado findProyectoDeGrado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ProyectoDeGrado.class, id);
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            ProyectoDeGrado p = em.find(ProyectoDeGrado.class, id);
            if (p == null)
                throw new NonexistentEntityException(
                    "No existe proyecto con id " + id);

            em.remove(p);
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
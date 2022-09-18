/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.controllers;

import co.parkapp.parkapp.controllers.exceptions.NonexistentEntityException;
import co.parkapp.parkapp.controllers.exceptions.PreexistingEntityException;
import co.parkapp.parkapp.models.Visitas;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author carmo
 */
public class VisitasJpaController implements Serializable {

    public VisitasJpaController() {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("parkapp_pu");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Visitas visitas) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(visitas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVisitas(visitas.getIdPropietario()) != null) {
                throw new PreexistingEntityException("Visitas " + visitas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Visitas visitas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            visitas = em.merge(visitas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = visitas.getIdPropietario();
                if (findVisitas(id) == null) {
                    throw new NonexistentEntityException("The visitas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Visitas visitas;
            try {
                visitas = em.getReference(Visitas.class, id);
                visitas.getIdPropietario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The visitas with id " + id + " no longer exists.", enfe);
            }
            em.remove(visitas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Visitas> findVisitasEntities() {
        return findVisitasEntities(true, -1, -1);
    }

    public List<Visitas> findVisitasEntities(int maxResults, int firstResult) {
        return findVisitasEntities(false, maxResults, firstResult);
    }

    private List<Visitas> findVisitasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Visitas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Visitas findVisitas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Visitas.class, id);
        } finally {
            em.close();
        }
    }

    public int getVisitasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Visitas> rt = cq.from(Visitas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

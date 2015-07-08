package br.com.gdgtresrios.sicomerciows.v1.model.dao;

import br.com.gdgtresrios.sicomerciows.v1.model.Evento;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Wanderlei on 02/07/2015.
 */
public class EventoDao {

    private final EntityManager entityManager;

    public EventoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Evento> findAll(){
        TypedQuery<Evento> query = entityManager.createNamedQuery("Evento.findAll", Evento.class);
        List<Evento> eventoList = query.getResultList();

        return eventoList;
    }

    public Evento findById(Long id){

        TypedQuery<Evento> query = entityManager
                .createNamedQuery("Evento.findById", Evento.class)
                .setParameter("id", id);
        Evento evento = query.getSingleResult();

        return evento;
    }

    public List<Evento> findByNome(String nome){

        TypedQuery<Evento> query = entityManager
                .createNamedQuery("Evento.findByNome", Evento.class)
                .setParameter("nome", nome + "%");
        List<Evento> eventoList = query.getResultList();

        return eventoList;

    }

    public List<Evento> findByCategoria(Long id){

        TypedQuery<Evento> query = entityManager
                .createNamedQuery("Evento.findByCategoria", Evento.class)
                .setParameter("id", id);
        List<Evento> eventoList = query.getResultList();

        return eventoList;
    }
}

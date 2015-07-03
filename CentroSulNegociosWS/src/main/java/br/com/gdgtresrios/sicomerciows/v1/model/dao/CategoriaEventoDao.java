package br.com.gdgtresrios.sicomerciows.v1.model.dao;

import br.com.gdgtresrios.sicomerciows.v1.model.CategoriaEvento;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Wanderlei on 28/06/2015.
 */

public class CategoriaEventoDao {

    private final EntityManager entityManager;

    public CategoriaEventoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<CategoriaEvento> findAll(){

        TypedQuery<CategoriaEvento> query = entityManager.createNamedQuery("CategoriaEvento.findAll", CategoriaEvento.class);
        return query.getResultList();

    }

    public CategoriaEvento findById(Long id){

        TypedQuery<CategoriaEvento> query = entityManager.createNamedQuery("CategoriaEvento.findById", CategoriaEvento.class)
                .setParameter("id", id);

        return query.getSingleResult();
    }

    public List<CategoriaEvento> findByNome(String nome){

        TypedQuery<CategoriaEvento> query = entityManager.createNamedQuery("CategoriaEvento.findByNome", CategoriaEvento.class)
                .setParameter("nome", nome + "%");

        return query.getResultList();
    }
}

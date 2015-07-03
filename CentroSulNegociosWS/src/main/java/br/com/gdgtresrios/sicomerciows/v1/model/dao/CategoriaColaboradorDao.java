package br.com.gdgtresrios.sicomerciows.v1.model.dao;

import br.com.gdgtresrios.sicomerciows.v1.model.CategoriaColaborador;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Wanderlei on 30/06/2015.
 */
public class CategoriaColaboradorDao {

    private EntityManager entityManager;

    public CategoriaColaboradorDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<CategoriaColaborador> findAll(){

        TypedQuery<CategoriaColaborador> query = entityManager.createNamedQuery("CategoriaColaborador.findAll", CategoriaColaborador.class);
        List<CategoriaColaborador> colaboradorList = query.getResultList();

        return colaboradorList;
    }

    public CategoriaColaborador findById(Long id){

        TypedQuery<CategoriaColaborador> query = entityManager
                .createNamedQuery("CategoriaColaborador.findById", CategoriaColaborador.class)
                .setParameter("id", id);
        CategoriaColaborador categoriaColaborador = query.getSingleResult();

        return categoriaColaborador;
    }

    public List<CategoriaColaborador> findByNome(String nome){

        TypedQuery<CategoriaColaborador> query = entityManager
                .createNamedQuery("CategoriaColaborador.findByNome", CategoriaColaborador.class)
                .setParameter("nome", nome + "%");
        List<CategoriaColaborador> colaboradorList = query.getResultList();

        return colaboradorList;
    }

}

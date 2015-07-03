package br.com.gdgtresrios.sicomerciows.v1.model.dao;

import br.com.gdgtresrios.sicomerciows.v1.model.Colaborador;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Wanderlei on 02/07/2015.
 */
public class ColaboradorDao {

    private final EntityManager entityManager;

    public ColaboradorDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Colaborador> findAll(){

        TypedQuery<Colaborador> query = entityManager.createNamedQuery("Colaborador.findAll", Colaborador.class);
        List<Colaborador> colaboradorList = query.getResultList();

        return colaboradorList;
    }

    public Colaborador findById(long id){

        TypedQuery<Colaborador> query = entityManager
                .createNamedQuery("Colaborador.findById", Colaborador.class)
                .setParameter("id", id);
        Colaborador colaborador = query.getSingleResult();

        return colaborador;
    }

    public List<Colaborador> findByNome(String nome){

        TypedQuery<Colaborador> query = entityManager
                .createNamedQuery("Colaborador.findByNome", Colaborador.class)
                .setParameter("nome", nome + "%");
        List<Colaborador> colaboradorList = query.getResultList();

        return colaboradorList;

    }
}

package br.com.gdgtresrios.sicomerciows.v1.model.dao;

import br.com.gdgtresrios.sicomerciows.v1.model.Configuracao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Wanderlei on 30/06/2015.
 */
public class ConfiguracaoDao {

    private final EntityManager entityManager;

    public ConfiguracaoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Configuracao> findAll(){

        TypedQuery<Configuracao> query = entityManager.createNamedQuery("Configuracao.findAll",Configuracao.class);
        List<Configuracao> configuracoes = query.getResultList();

        return configuracoes;

    }
}

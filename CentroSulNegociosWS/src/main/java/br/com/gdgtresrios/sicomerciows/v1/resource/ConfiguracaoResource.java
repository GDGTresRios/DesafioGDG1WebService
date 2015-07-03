package br.com.gdgtresrios.sicomerciows.v1.resource;

import br.com.gdgtresrios.sicomerciows.v1.model.Configuracao;
import br.com.gdgtresrios.sicomerciows.v1.model.dao.ConfiguracaoDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Wanderlei on 30/06/2015.
 */
@Path("/configuracao")
public class ConfiguracaoResource {

    private ConfiguracaoDao configuracaoDao;

    @GET
    @Path("/findAll")
    @Produces("application/json;charset=utf-8")
    public List<Configuracao> findAll(){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        configuracaoDao = new ConfiguracaoDao(em);
        List<Configuracao> configuracaoList = configuracaoDao.findAll();

        return configuracaoList;
    }
}

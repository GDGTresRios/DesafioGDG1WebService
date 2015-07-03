package br.com.gdgtresrios.sicomerciows.v1.resource;

import br.com.gdgtresrios.sicomerciows.v1.model.Colaborador;
import br.com.gdgtresrios.sicomerciows.v1.model.dao.ColaboradorDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Wanderlei on 02/07/2015.
 */
@Path("/colaborador")
public class ColaboradorResource {

    private ColaboradorDao colaboradorDao;

    @GET
    @Path("/findAll")
    @Produces("application/json;charset=utf-8")
    public List<Colaborador> findAll(){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new ColaboradorDao(em);

        List<Colaborador> colaboradorList = colaboradorDao.findAll();

        return colaboradorList;
    }

    @GET
    @Path("/id/{id}")
    @Produces("application/json;charset=utf-8")
    public Colaborador findById(@PathParam("id") Long id){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new ColaboradorDao(em);

        Colaborador colaborador = colaboradorDao.findById(id);

        return colaborador;

    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json;charset=utf-8")
    public List<Colaborador> findByNome(@PathParam("nome") String nome){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new ColaboradorDao(em);

        List<Colaborador> colaboradorList = colaboradorDao.findByNome(nome);

        return colaboradorList;
    }
}

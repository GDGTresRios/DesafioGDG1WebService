package br.com.gdgtresrios.sicomerciows.v1.resource;

import br.com.gdgtresrios.sicomerciows.v1.model.CategoriaColaborador;
import br.com.gdgtresrios.sicomerciows.v1.model.dao.CategoriaColaboradorDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Wanderlei on 30/06/2015.
 */
@Path("/categoriacolaborador")
public class CategoriaColaboradorResource {

    private CategoriaColaboradorDao colaboradorDao;

    @GET
    @Path("/findAll")
    @Produces("application/json;charset=utf-8")
    public List<CategoriaColaborador> findAll(){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new CategoriaColaboradorDao(em);
        List<CategoriaColaborador> categoriaColaboradorList = colaboradorDao.findAll();

        return categoriaColaboradorList;
    }

    @GET
    @Path("/id/{id}")
    @Produces("application/json;charset=utf-8")
    public CategoriaColaborador findById(@PathParam("id") long id){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new CategoriaColaboradorDao(em);
        CategoriaColaborador categoriaColaborador = colaboradorDao.findById(id);

        return categoriaColaborador;
    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json;charset=utf-8")
    public List<CategoriaColaborador> findByNome(@PathParam("nome") String nome){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        colaboradorDao = new CategoriaColaboradorDao(em);
        List<CategoriaColaborador> colaboradorList = colaboradorDao.findByNome(nome);

        return colaboradorList;
    }
}

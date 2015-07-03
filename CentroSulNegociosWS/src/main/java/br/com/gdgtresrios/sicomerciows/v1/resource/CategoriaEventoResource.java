package br.com.gdgtresrios.sicomerciows.v1.resource;

import br.com.gdgtresrios.sicomerciows.v1.model.CategoriaEvento;
import br.com.gdgtresrios.sicomerciows.v1.model.dao.CategoriaEventoDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Wanderlei on 28/06/2015.
 */

@Path("/categoriaevento")
public class CategoriaEventoResource {

    private CategoriaEventoDao eventoDao;

    @GET
    @Path("/findAll")
    @Produces("application/json;charset=utf-8")
    public List<CategoriaEvento> findAll(){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new CategoriaEventoDao(em);

        List<CategoriaEvento> categoriaEventos = eventoDao.findAll();

        return categoriaEventos;
    }

    @GET
    @Path("/id/{id}")
    @Produces("application/json;charset=utf-8")
    public CategoriaEvento findById(@PathParam("id") long id){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new CategoriaEventoDao(em);
        CategoriaEvento categoriaEvento = eventoDao.findById(id);

        return categoriaEvento;
    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json;charset=utf-8")
    public List<CategoriaEvento> findByNome(@PathParam("nome") String nome){

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new CategoriaEventoDao(em);

        List<CategoriaEvento> categoriaEventos = eventoDao.findByNome(nome);

        return categoriaEventos;
    }
}

package br.com.gdgtresrios.sicomerciows.v1.resource;

import br.com.gdgtresrios.sicomerciows.v1.model.Evento;
import br.com.gdgtresrios.sicomerciows.v1.model.dao.EventoDao;

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
@Path("/evento")
public class EventoResource {

    private EventoDao eventoDao;

    @GET
    @Path("/findAll")
    @Produces("application/json;charset=utf-8")
    public List<Evento> findAll(){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new EventoDao(em);

        List<Evento> eventoList = eventoDao.findAll();

        return eventoList;

    }

    @GET
    @Path("/id/{id}")
    @Produces("application/json;charset=utf-8")
    public Evento findById(@PathParam("id") Long id){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new EventoDao(em);

        return eventoDao.findById(id);
    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json;charset=utf-8")
    public List<Evento> findByNome(@PathParam("nome") String nome){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new EventoDao(em);

        return eventoDao.findByNome(nome);
    }

    @GET
    @Path("/categoria/{id}")
    @Produces("application/json;charset=utf-8")
    public List<Evento> findByCategoria(@PathParam("id") Long id){

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("gdg_centrosul");
        EntityManager em = factory.createEntityManager();

        eventoDao = new EventoDao(em);

        return eventoDao.findByCategoria(id);
    }
}

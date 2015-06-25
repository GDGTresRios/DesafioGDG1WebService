/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

import br.com.gdgtresrios.sicomerciows.resource.dao.EventoDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.Evento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Wanderlei
 */
@Path("/eventos")
public class EventoResource {

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<Evento> getAll() {

        EventoDAO dao = new EventoDAO();
        List<Evento> eventos = dao.getAll();

        return eventos;
    }

    @GET
    @Path("/evento/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public Evento getEventoById(@PathParam("id") int id) {

        EventoDAO dao = new EventoDAO();
        Evento evento = dao.getEventoById(id);

        return evento;
    }

    @GET
    @Path("/evento/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<Evento> getEventoByNome(@PathParam("nome") String nome) {

        EventoDAO dao = new EventoDAO();
        List<Evento> eventos = dao.getEventoByNome(nome);

        return eventos;

    }

}

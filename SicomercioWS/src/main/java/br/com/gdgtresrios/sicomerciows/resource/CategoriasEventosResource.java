/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

/**
 *
 * @author Wanderlei
 */
import br.com.gdgtresrios.sicomerciows.resource.dao.CategoriasEventosDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.CategoriasEventos;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/categoriaseventos")
public class CategoriasEventosResource {

    @GET
    @Path("/categoriaevento/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public CategoriasEventos getCategoriasEventosByID(@PathParam("id") int id) throws IOException {

        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        CategoriasEventos categoriasEventos = eventosDAO.getCategoriasEventosByID(id);

        return categoriasEventos;
        
    }
    
    @GET
    @Path("/categoriaevento/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriasEventos> getCategoriasEventosByNome(@PathParam("nome") String nome) {
        
        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        List<CategoriasEventos> categoriasEventos = eventosDAO.getCategoriasEventosByNome(nome);
        
        return categoriasEventos;
        
    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriasEventos> getAll() throws  IOException {

        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        List<CategoriasEventos> categoriasEventos = eventosDAO.getAll();
        
        return categoriasEventos;

    }

}

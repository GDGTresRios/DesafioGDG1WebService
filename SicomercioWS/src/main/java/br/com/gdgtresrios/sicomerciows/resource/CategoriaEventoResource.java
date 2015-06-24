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
import br.com.gdgtresrios.sicomerciows.resource.dao.CategoriaEventoDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.CategoriaEvento;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/categoriaseventos")
public class CategoriaEventoResource {

    @GET
    @Path("/categoriaevento/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public CategoriaEvento getCategoriasEventosByID(@PathParam("id") int id) throws IOException {

        CategoriaEventoDAO eventosDAO = new CategoriaEventoDAO();
        CategoriaEvento categoriasEventos = eventosDAO.getCategoriasEventosByID(id);

        return categoriasEventos;
        
    }
    
    @GET
    @Path("/categoriaevento/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriaEvento> getCategoriasEventosByNome(@PathParam("nome") String nome) {
        
        CategoriaEventoDAO eventosDAO = new CategoriaEventoDAO();
        List<CategoriaEvento> categoriasEventos = eventosDAO.getCategoriasEventosByNome(nome);
        
        return categoriasEventos;
        
    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriaEvento> getAll() throws  IOException {

        CategoriaEventoDAO eventosDAO = new CategoriaEventoDAO();
        List<CategoriaEvento> categoriasEventos = eventosDAO.getAll();
        
        return categoriasEventos;

    }

}

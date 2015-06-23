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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.StringWriter;
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
    public String getCategoriasEventosByID(@PathParam("id") int id) throws IOException {

        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        CategoriasEventos categoriasEventos = eventosDAO.getCategoriasEventosByID(id);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter writer = new StringWriter();

        objectMapper.writeValue(writer, categoriasEventos);

        return writer.toString();
    }
    
    @GET
    @Path("/categoriaevento/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public String getCategoriasEventosByNome(@PathParam("nome") String nome) throws JsonProcessingException {
        
        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        List<CategoriasEventos> categoriasEventos = eventosDAO.getCategoriasEventosByNome(nome);
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        
        return  objectMapper.writeValueAsString(categoriasEventos);
    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public String getAll() throws JsonProcessingException, IOException {

        CategoriasEventosDAO eventosDAO = new CategoriasEventosDAO();
        List<CategoriasEventos> categoriasEventos = eventosDAO.getAll();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        return objectMapper.writeValueAsString(categoriasEventos);
    }

}

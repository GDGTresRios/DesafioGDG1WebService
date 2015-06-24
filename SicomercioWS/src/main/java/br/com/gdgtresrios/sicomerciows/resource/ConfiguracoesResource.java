/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

import br.com.gdgtresrios.sicomerciows.resource.dao.ConfiguracoesDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.Configuracoes;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Wanderlei
 */
@Path("/configuracoes")
public class ConfiguracoesResource {
    
    @GET
    @Path("/listartodos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Configuracoes> getAll(){
        
        ConfiguracoesDAO dao = new ConfiguracoesDAO();
        List<Configuracoes> configuracoes = dao.getAll();
        
        return configuracoes;
    }
    
}

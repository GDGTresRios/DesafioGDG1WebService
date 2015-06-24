/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

import br.com.gdgtresrios.sicomerciows.resource.dao.ConfiguracaoDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.Configuracao;
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
public class ConfiguracaoResource {
    
    @GET
    @Path("/listartodos")
     @Produces("application/json; charset=UTF-8")
    public List<Configuracao> getAll(){
        
        ConfiguracaoDAO dao = new ConfiguracaoDAO();
        List<Configuracao> configuracoes = dao.getAll();
        
        return configuracoes;
    }
    
}

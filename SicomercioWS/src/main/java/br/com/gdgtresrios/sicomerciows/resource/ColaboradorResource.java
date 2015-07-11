package br.com.gdgtresrios.sicomerciows.resource;

/**
 * luciano.sfjtci@gmail.com
 *
 * @author Luciano Junior
 */
import br.com.gdgtresrios.sicomerciows.resource.dao.ColaboradorDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.Colaborador;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/colaboradores")
public class ColaboradorResource {

    @GET
    @Path("/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public Colaborador getByID(@PathParam("id") Long id) throws IOException {

        ColaboradorDAO cDAO = new ColaboradorDAO();
        Colaborador c = cDAO.getById(id);

        return c;

    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<Colaborador> getByNome(@PathParam("nome") String nome) {

        ColaboradorDAO cDAO = new ColaboradorDAO();
        List<Colaborador> c = cDAO.getByNome(nome);

        return c;

    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<Colaborador> getAll() throws IOException {

        ColaboradorDAO cDAO = new ColaboradorDAO();
        List<Colaborador> c = cDAO.getAll();

        return c;

    }

    @GET
    @Path("/categoria/{idCategoria}")
    @Produces("application/json; charset=UTF-8")
    public List<Colaborador> getByCategoria(@PathParam("idCategoria") Long idCategoria) throws IOException {
        
        ColaboradorDAO cDAO = new ColaboradorDAO();
        List<Colaborador> c = cDAO.getByCategoria(idCategoria);
        
        return c;
    }

}

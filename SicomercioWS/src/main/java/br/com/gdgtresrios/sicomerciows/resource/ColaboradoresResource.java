package br.com.gdgtresrios.sicomerciows.resource;

/**
 * luciano.sfjtci@gmail.com
 *
 * @author Luciano Junior
 */
import br.com.gdgtresrios.sicomerciows.resource.dao.ColaboradoresDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.Colaboradores;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/colaboradores")
public class ColaboradoresResource {

    @GET
    @Path("/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public Colaboradores getByID(@PathParam("id") int id) throws IOException {

        ColaboradoresDAO cDAO = new ColaboradoresDAO();
        Colaboradores c = cDAO.getById(id);

        return c;

    }

    @GET
    @Path("/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<Colaboradores> getByNome(@PathParam("nome") String nome) {

        ColaboradoresDAO cDAO = new ColaboradoresDAO();
        List<Colaboradores> c = cDAO.getByNome(nome);

        return c;

    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<Colaboradores> getAll() throws IOException {

        ColaboradoresDAO cDAO = new ColaboradoresDAO();
        List<Colaboradores> c = cDAO.getAll();

        return c;

    }

    @GET
    @Path("/categoria/{idCategoria}")
    @Produces("application/json; charset=UTF-8")
    public List<Colaboradores> getByCategoria(@PathParam("idCategoria") int idCategoria) throws IOException {
        
        ColaboradoresDAO cDAO = new ColaboradoresDAO();
        List<Colaboradores> c = cDAO.getByCategoria(idCategoria);
        
        return c;
    }

}

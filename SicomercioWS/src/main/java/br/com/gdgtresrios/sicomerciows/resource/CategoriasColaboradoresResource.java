package br.com.gdgtresrios.sicomerciows.resource;

/**
 * Categoria - Colaboradores Class
 * fernandosouzaconceicao@gmail.com
 * @author Fernando Souza
 */
import br.com.gdgtresrios.sicomerciows.resource.dao.CategoriasColaboradoresDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.CategoriasColaboradores;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/categoriascolaboradores")
public class CategoriasColaboradoresResource {

    @GET
    @Path("/categoriacolaborador/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public CategoriasColaboradores getByID(@PathParam("id") int id) throws IOException {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        CategoriasColaboradores categoriasColaboradores = colaboradoresDAO.getByID(id);

        return categoriasColaboradores;

    }

    @GET
    @Path("/categoriacolaborador/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriasColaboradores> getByNome(@PathParam("nome") String nome) {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        List<CategoriasColaboradores> categoriasColaboradores = colaboradoresDAO.getByNome(nome);

        return categoriasColaboradores;

    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriasColaboradores> getAll() throws IOException {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        List<CategoriasColaboradores> categoriasColaboradores = colaboradoresDAO.getAll();

        return categoriasColaboradores;

    }

}

package br.com.gdgtresrios.sicomerciows.resource;

/**
 * Categoria - Colaboradores Class
 * fernandosouzaconceicao@gmail.com
 * @author Fernando Souza
 */
import br.com.gdgtresrios.sicomerciows.resource.dao.CategoriasColaboradoresDAO;
import br.com.gdgtresrios.sicomerciows.resource.models.CategoriaColaborador;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/categoriascolaboradores")
public class CategoriaColaboradorResource {

    @GET
    @Path("/categoriacolaborador/id/{id}")
    @Produces("application/json; charset=UTF-8")
    public CategoriaColaborador getByID(@PathParam("id") Long id) throws IOException {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        CategoriaColaborador categoriasColaboradores = colaboradoresDAO.getByID(id);

        return categoriasColaboradores;

    }

    @GET
    @Path("/categoriacolaborador/nome/{nome}")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriaColaborador> getByNome(@PathParam("nome") String nome) {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        List<CategoriaColaborador> categoriasColaboradores = colaboradoresDAO.getByNome(nome);

        return categoriasColaboradores;

    }

    @GET
    @Path("/listartodos")
    @Produces("application/json; charset=UTF-8")
    public List<CategoriaColaborador> getAll() throws IOException {

        CategoriasColaboradoresDAO colaboradoresDAO = new CategoriasColaboradoresDAO();
        List<CategoriaColaborador> categoriasColaboradores = colaboradoresDAO.getAll();

        return categoriasColaboradores;

    }

}

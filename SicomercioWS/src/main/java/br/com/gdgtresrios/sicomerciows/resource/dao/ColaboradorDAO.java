package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * E-mail: luciano.sfjtci@gmail.com
 *
 * @author Luciano Junior
 */
public class ColaboradorDAO {

    private static final String nome_tabela = "colaboradores";
    private static final String SQL_SELECT_ALL = "SELECT * FROM " + nome_tabela;
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM " + nome_tabela + " WHERE id = ?";
    private static final String SQL_SELECT_BY_NOME = "SELECT * FROM " + nome_tabela + " WHERE nome like ?";
    private static final String SQL_SELECT_BY_CATEGORIA = "SELECT * FROM " + nome_tabela + " WHERE fk_categoria = ?";

    public List<Colaborador> getAll() {
        List<Colaborador> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaborador c = null;
        CategoriasColaboradoresDAO ccDao = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaborador();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getLong("patrocinador"));
                c.setPalestrante(rs.getLong("palestrante"));
                c.setExpositor(rs.getLong("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getLong("fk_categoria")));

                lista.add(c);

            }
        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;

    }

    public Colaborador getById(Long id) {

        Colaborador c = new Colaborador();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setLong(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriasColaboradoresDAO ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getLong("patrocinador"));
                c.setPalestrante(rs.getLong("palestrante"));
                c.setExpositor(rs.getLong("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getLong("fk_categoria")));
            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return c;
    }

    public List<Colaborador> getByNome(String nome) {

        List<Colaborador> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaborador c = null;
        CategoriasColaboradoresDAO ccDao = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaborador();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getLong("patrocinador"));
                c.setPalestrante(rs.getLong("palestrante"));
                c.setExpositor(rs.getLong("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getLong("fk_categoria")));

                lista.add(c);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;
    }

    public List<Colaborador> getByCategoria(Long idCategoria) {
        List<Colaborador> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaborador c = null;
        CategoriasColaboradoresDAO ccDao = null;
        
        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_CATEGORIA);
            pstm.setLong(1, idCategoria);
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaborador();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getLong("patrocinador"));
                c.setPalestrante(rs.getLong("palestrante"));
                c.setExpositor(rs.getLong("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getLong("fk_categoria")));

                lista.add(c);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;
    }
}

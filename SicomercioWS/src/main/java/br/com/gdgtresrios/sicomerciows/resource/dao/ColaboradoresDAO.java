package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.Colaboradores;
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
public class ColaboradoresDAO {

    private static final String nome_tabela = "colaboradores";
    private static final String SQL_SELECT_ALL = "SELECT * FROM " + nome_tabela;
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM " + nome_tabela + " WHERE id = ?";
    private static final String SQL_SELECT_BY_NOME = "SELECT * FROM " + nome_tabela + " WHERE nome like ?";
    private static final String SQL_SELECT_BY_CATEGORIA = "SELECT * FROM " + nome_tabela + " WHERE fk_categoria = ?";

    public List<Colaboradores> getAll() {
        List<Colaboradores> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaboradores c = null;
        CategoriasColaboradoresDAO ccDao = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaboradores();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getInt("patrocinador"));
                c.setPalestrante(rs.getInt("palestrante"));
                c.setExpositor(rs.getInt("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getInt("fk_categoria")));

                lista.add(c);

            }
        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;

    }

    public Colaboradores getById(int id) {

        Colaboradores c = new Colaboradores();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriasColaboradoresDAO ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getInt("patrocinador"));
                c.setPalestrante(rs.getInt("palestrante"));
                c.setExpositor(rs.getInt("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getInt("fk_categoria")));
            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return c;
    }

    public List<Colaboradores> getByNome(String nome) {

        List<Colaboradores> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaboradores c = null;
        CategoriasColaboradoresDAO ccDao = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaboradores();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getInt("patrocinador"));
                c.setPalestrante(rs.getInt("palestrante"));
                c.setExpositor(rs.getInt("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getInt("fk_categoria")));

                lista.add(c);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;
    }

    public List<Colaboradores> getByCategoria(int idCategoria) {
        List<Colaboradores> lista = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaboradores c = null;
        CategoriasColaboradoresDAO ccDao = null;
        
        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_CATEGORIA);
            pstm.setInt(1, idCategoria);
            rs = pstm.executeQuery();

            while (rs.next()) {
                c = new Colaboradores();
                ccDao = new CategoriasColaboradoresDAO();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setDescricao_detalhada(rs.getString("descricao_detalhada"));
                c.setEndereco_virtual(rs.getString("endereco_virtual"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setPatrocinador(rs.getInt("patrocinador"));
                c.setPalestrante(rs.getInt("palestrante"));
                c.setExpositor(rs.getInt("expositor"));
                c.setCategoriaColaboradores(ccDao.getByID(rs.getInt("fk_categoria")));

                lista.add(c);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return lista;
    }
}

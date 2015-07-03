package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.CategoriaColaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Categoria - Colaboradores Class
 * fernandosouzaconceicao@gmail.com
 * @author Fernando Souza
 */
public class CategoriasColaboradoresDAO {

    private static final String SQL_SELECT_ALL = "SELECT id, nome, logo FROM gdg_centrosul.categorias_colaboradores";
    private static final String SQL_SELECT_BY_ID = "SELECT id, nome, logo FROM gdg_centrosul.categorias_colaboradores WHERE id = ?";
    private static final String SQL_SELECT_BY_NOME = "SELECT id, nome, logo FROM gdg_centrosul.categorias_colaboradores WHERE nome like ?";

    public CategoriaColaborador getByID(Long id) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriaColaborador categoriasColaboradores = new CategoriaColaborador();
        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setLong(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                categoriasColaboradores.setId(rs.getLong("id"));
                categoriasColaboradores.setNome(rs.getString("nome"));
                categoriasColaboradores.setLogo(rs.getString("logo"));

            }

        } catch (SQLException ex) {
        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return categoriasColaboradores;

    }

    public List<CategoriaColaborador> getAll() {

        List<CategoriaColaborador> categoriasColaboradores = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriaColaborador ct = new CategoriaColaborador();
                ct.setId(rs.getLong("id"));
                ct.setNome(rs.getString("nome"));
                ct.setLogo(rs.getString("logo"));

                categoriasColaboradores.add(ct);
            }
        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return categoriasColaboradores;
    }

    public List<CategoriaColaborador> getByNome(String nome) {

        List<CategoriaColaborador> categoriasColaboradores = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriaColaborador ct = new CategoriaColaborador();
                ct.setId(rs.getLong("id"));
                ct.setNome(rs.getString("nome"));
                ct.setLogo(rs.getString("logo"));
                categoriasColaboradores.add(ct);
            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return categoriasColaboradores;
    }

}

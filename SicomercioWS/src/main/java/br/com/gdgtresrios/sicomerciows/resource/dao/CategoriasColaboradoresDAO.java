package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.CategoriasColaboradores;
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

    public CategoriasColaboradores getByID(int id) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriasColaboradores categoriasColaboradores = new CategoriasColaboradores();
        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                categoriasColaboradores.setId(rs.getInt("id"));
                categoriasColaboradores.setNome(rs.getString("nome"));
                categoriasColaboradores.setLogo(rs.getString("logo"));

            }

        } catch (SQLException ex) {
        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return categoriasColaboradores;

    }

    public List<CategoriasColaboradores> getAll() {

        List<CategoriasColaboradores> categoriasColaboradores = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriasColaboradores ct = new CategoriasColaboradores();
                ct.setId(rs.getInt("id"));
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

    public List<CategoriasColaboradores> getByNome(String nome) {

        List<CategoriasColaboradores> categoriasColaboradores = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {

                CategoriasColaboradores ct = new CategoriasColaboradores();
                ct.setId(rs.getInt("id"));
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

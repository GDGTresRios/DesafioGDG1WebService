package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Revisão Fernando 11/07/2015
 *
 * @author Wanderlei
 */
public class EventoDAO {

    private static final String SQL_SELECT_ALL = "SELECT id, nome, descricao, descricao_detalhada, data_hora, duracao, local, fk_categoria, fk_colaborador FROM eventos";
    private static final String SQL_SELECT_BY_ID = "SELECT id, nome, descricao, descricao_detalhada, data_hora, duracao, local, fk_categoria, fk_colaborador FROM eventos WHERE id = ?";
    private static final String SQL_SELECT_BY_NOME = "SELECT id, nome, descricao, descricao_detalhada, data_hora, duracao, local, fk_categoria, fk_colaborador FROM eventos WHERE nome like ?";
    private static final String SQL_SELECT_BY_CATEGORIA = "SELECT id, nome, descricao, descricao_detalhada, data_hora, duracao, local, fk_categoria, fk_colaborador FROM eventos WHERE fk_categoria = ?";

    public List<Evento> getAll() {

        List<Evento> eventos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();
            CategoriaEventoDAO dao = new CategoriaEventoDAO();
            ColaboradorDAO daoColaborador = new ColaboradorDAO();
            while (rs.next()) {

                Evento e = new Evento();
                e.setId(rs.getLong("id"));
                e.setNome(rs.getString("nome"));
                e.setDescricao(rs.getString("descricao"));
                e.setDescricaoDetalhada(rs.getString("descricao_detalhada"));
                e.setDataHora(rs.getDate("data_hora"));
                e.setDuracao(rs.getTime("duracao"));
                e.setLocal(rs.getString("local"));
                e.setCategoriaEvento(dao.getCategoriasEventosByID(rs.getLong("fk_categoria")));
                e.setColaborador(daoColaborador.getById(rs.getLong("fk_colaborador")));
                eventos.add(e);

            }
        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return eventos;
    }

    public Evento getEventoById(int id) {

        Evento evento = new Evento();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (rs.first()) {
                CategoriaEventoDAO dao = new CategoriaEventoDAO();
                ColaboradorDAO daoColaborador = new ColaboradorDAO();
                evento.setId(rs.getLong("id"));
                evento.setNome(rs.getString("nome"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDescricaoDetalhada(rs.getString("descricao_detalhada"));
                evento.setDataHora(rs.getDate("data_hora"));
                evento.setDuracao(rs.getTime("duracao"));
                evento.setLocal(rs.getString("local"));
                evento.setCategoriaEvento(dao.getCategoriasEventosByID(rs.getLong("fk_categoria")));
                evento.setColaborador(daoColaborador.getById(rs.getLong("fk_colaborador")));

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return evento;
    }

    public List<Evento> getEventoByNome(String nome) {

        List<Evento> eventos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();
            CategoriaEventoDAO dao = new CategoriaEventoDAO();
            ColaboradorDAO daoColaborador = new ColaboradorDAO();
            while (rs.next()) {
                Evento e = new Evento();
                e.setId(rs.getLong("id"));
                e.setNome(rs.getString("nome"));
                e.setDescricao(rs.getString("descricao"));
                e.setDescricaoDetalhada(rs.getString("descricao_detalhada"));
                e.setDataHora(rs.getDate("data_hora"));
                e.setDuracao(rs.getTime("duracao"));
                e.setLocal(rs.getString("local"));
                e.setCategoriaEvento(dao.getCategoriasEventosByID(rs.getLong("fk_categoria")));
                e.setColaborador(daoColaborador.getById(rs.getLong("fk_colaborador")));
                eventos.add(e);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return eventos;
    }

    public List<Evento> getEventoByCategoria(int idCategoria) {
        List<Evento> eventos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            pstm = conn.prepareStatement(SQL_SELECT_BY_CATEGORIA);
            pstm.setInt(1, idCategoria);
            rs = pstm.executeQuery();
            CategoriaEventoDAO dao = new CategoriaEventoDAO();
            ColaboradorDAO daoColaborador = new ColaboradorDAO();

            while (rs.next()) {

                Evento e = new Evento();
                e.setId(rs.getLong("id"));
                e.setNome(rs.getString("nome"));
                e.setDescricao(rs.getString("descricao"));
                e.setDescricaoDetalhada(rs.getString("descricao_detalhada"));
                e.setDataHora(rs.getDate("data_hora"));
                e.setDuracao(rs.getTime("duracao"));
                e.setLocal(rs.getString("local"));
                e.setCategoriaEvento(dao.getCategoriasEventosByID(rs.getLong("fk_categoria")));
                e.setColaborador(daoColaborador.getById(rs.getLong("fk_colaborador")));
                eventos.add(e);

            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }

        return eventos;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.CategoriasEventos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Wanderlei
 */
public class CategoriasEventosDAO {

    private static final String SQL_SELECT_BY_ID = "SELECT id, nome, logo FROM gdg_centrosul.categorias_eventos WHERE id = ?";

    public CategoriasEventos getCategoriasEventosByID(int id) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriasEventos categoriasEventos = new CategoriasEventos();
        try {
            
            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                categoriasEventos.setId(rs.getInt(1));
                categoriasEventos.setNome(rs.getString(2));
                categoriasEventos.setLogo(rs.getString(3));
            }
            
        } catch (SQLException ex) {
        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }
        
        return categoriasEventos;
        
    }

}
